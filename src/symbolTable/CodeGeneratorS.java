package symbolTable;

import AST.*;
import symbolTable.symbols.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;

public class CodeGeneratorS {
    private final ComponentSymbolTable componentTable;
    private final PropertySymbolTable propertyTable;
    private final TemplateVariableScopeTable scopeTable;
    private final TypeSymbolTable typeTable;
    private final ModuleDependencyGraph moduleGraph;
    private final PipeSymbolTable pipeTable;
    private final FunctionsSymbolTable functionsTable;

    private final StringWriter jsOutput = new StringWriter();
    private final PrintWriter writer = new PrintWriter(jsOutput);
    private final Set<String> generatedModules = new HashSet<>();
    private final String currentComponentName = null;

    public CodeGeneratorS(ComponentSymbolTable componentTable,
                         PropertySymbolTable propertyTable,
                         TemplateVariableScopeTable scopeTable,
                         TypeSymbolTable typeTable,
                         ModuleDependencyGraph moduleGraph,
                         PipeSymbolTable pipeTable,
                         FunctionsSymbolTable functionsTable) {
        this.componentTable = componentTable;
        this.propertyTable = propertyTable;
        this.scopeTable = scopeTable;
        this.typeTable = typeTable;
        this.moduleGraph = moduleGraph;
        this.pipeTable = pipeTable;
        this.functionsTable = functionsTable;
    }

    /**
     * Generate JavaScript code from the AST program.
     * @param program The root AST node from BaseVisitor.
     * @return Generated JavaScript code as a string.
     */
    public String generate(Program program) {
        // Generate runtime helpers (e.g., EventEmitter, change detection).
        generateRuntimeHelpers();

        // Process all statements in the program.
        for (Statement stmt : program.getStatements()) {
            if (stmt.getComponentDefinition() != null) {
                generateComponent((ComponentDefinition) stmt.getComponentDefinition());
            } else if (stmt instanceof ImportStatement) {
                generateImport((ImportStatement) stmt);
            } else if (stmt instanceof ClassDeclaration) {
                generateClass((ClassDeclaration) stmt);
            }
            // Add other statement types (e.g., ModuleDeclaration) as needed.
        }

        writer.flush();
        return jsOutput.toString();
    }

    private void generateRuntimeHelpers() {
        // Simple EventEmitter for output bindings.
        writer.println("class EventEmitter {");
        writer.println("  listeners = [];");
        writer.println("  subscribe(fn) { this.listeners.push(fn); }");
        writer.println("  emit(value) { this.listeners.forEach(fn => fn(value)); }");
        writer.println("}\n");

        // Add more runtime helpers (e.g., change detection) as needed.
    }

    private void generateImport(ImportStatement importStmt) {
        if (importStmt.getImportClause() != null && importStmt.getStringLiteral() != null) {
            String modulePath = importStmt.getStringLiteral().replaceAll("^['\"]|['\"]$", "");
            writer.printf("import %s from '%s';\n", importStmt.getImportClause().toString(), modulePath);
        }
    }

    private void generateClass(ClassDeclaration classDecl) {
        String className = classDecl.getIdentifier();
        writer.printf("class %s {\n", className);

        // Generate class body (fields, methods, constructor).
        for (ClassBody body : classDecl.getClassBodies()) {
            if (body.getVariableStatement() != null) {
                generateVariableStatement(body.getVariableStatement());
            }
            if (body.getFunctionDeclaration() != null) {
                generateFunctionDeclaration(body.getFunctionDeclaration());
            }
            if (body.getConstructorDeclaration() != null) {
                generateConstructorDeclaration(body.getConstructorDeclaration());
            }
        }

        writer.println("}\n");
    }

    private void generateVariableStatement(VariableStatement varStmt) {
        if (varStmt.getIdentifier() != null) {
            writer.printf("  %s;\n", varStmt.getIdentifier());
            // Initialize with default value if present (e.g., array, object).
            if (varStmt.getArray() != null) {
                writer.printf("  %s = %s;\n", varStmt.getIdentifier(), generateArray(varStmt.getArray()));
            } else if (varStmt.getObject() != null) {
                writer.printf("  %s = %s;\n", varStmt.getIdentifier(), generateObject(varStmt.getObject()));
            }
        }
    }

    private void generateFunctionDeclaration(FunctionDeclaration funcDecl) {
        String funcName = funcDecl.getIdentifier();
        writer.printf("  %s(%s) {\n", funcName, generateParameterList(funcDecl.getParameterList()));
        if (funcDecl.getBlock() != null) {
            // TODO: Generate block statements (e.g., assignments, expressions).
            writer.println("    // TODO: Implement function body");
        }
        writer.println("  }\n");
    }

    private void generateConstructorDeclaration(ConstructorDeclaration constructorDecl) {
        writer.printf("  constructor(%s) {\n", generateParameterList(constructorDecl.getParameterList()));
        // Initialize inputs/outputs from symbol table.
        if (currentComponentName != null) {
            ComponentSymbol component = componentTable.getComponents().get(currentComponentName);
            if (component != null) {
                for (InputSymbol input : component.getInputs()) {
                    writer.printf("    this.%s = null; // Type: %s\n", input.getName(), input.getType().getName());
                }
                for (OutputSymbol output : component.getOutputs()) {
                    writer.printf("    this.%s = new EventEmitter(); // Type: %s\n", output.getName(), output.getEventType().getName());
                }
            }
        }
        if (constructorDecl.getBlock() != null) {
            // TODO: Generate block statements.
            writer.println("    // TODO: Implement constructor body");
        }
        writer.println("  }\n");
    }

    private String generateParameterList(ParameterList paramList) {
        if (paramList == null) return "";
        List<String> params = new ArrayList<>();
        if (paramList.getIdentifier() != null) {
            params.add(paramList.getIdentifier());
        }
        for (CommaParameterList commaParam : paramList.getCommaParameterLists()) {
            if (commaParam.getParameterList() != null && commaParam.getParameterList().getIdentifier() != null) {
                params.add(commaParam.getParameterList().getIdentifier());
            }
        }
        return String.join(", ", params);
    }

    private void generateComponent(ComponentDefinition compDef) {
        // Assume class declaration follows decorator (handled in ClassDeclaration).
        if (compDef.getDecorator() != null && compDef.getDecorator().getComponentOptions() != null) {
            ComponentOptions opts = compDef.getDecorator().getComponentOptions();
            String selector = null;
            Template template = null;

            // Extract selector and template from component properties.
            if (opts.getComponentPropertyList() != null) {
                ComponentProperty prop = opts.getComponentPropertyList().getComponentProperty();
                if (prop.getSelector() != null) {
                    selector = prop.getStringLiteral().replaceAll("^['\"]|['\"]$", "");
                }
                if (prop.getTemplate() != null) {
                    template = prop.getTemplatet();
                }
                for (CommaComponentProperty commaProp : opts.getComponentPropertyList().getCommaComponentProperties()) {
                    if (commaProp.getComponentProperty().getSelector() != null) {
                        selector = commaProp.getComponentProperty().getStringLiteral().replaceAll("^['\"]|['\"]$", "");
                    }
                    if (commaProp.getComponentProperty().getTemplate() != null) {
                        template = commaProp.getComponentProperty().getTemplatet();
                    }
                }
            }

            if (selector != null) {
                writer.printf("%s.selector = '%s';\n", currentComponentName, selector);
            }
            if (template != null) {
                writer.println("  render() {");
                generateTemplate(template);
                writer.println("  }\n");
            }
        }
    }

    private void generateTemplate(Template template) {
        if (template.getHtmlContent() != null) {
            writer.println("    const element = document.createElement('div');");
            generateHtmlContent(template.getHtmlContent(), "    ");
            writer.println("    return element;");
        }
    }

    private void generateHtmlContent(HtmlContent content, String indent) {
        for (HtmlElement elem : content.getHtmlElements()) {
            generateHtmlElement(elem, indent);
        }
        for (Interpolation interp : content.getInterpolations()) {
            generateInterpolation(interp, indent);
        }
        for (AngularDirective dir : content.getAngularDirectives()) {
            generateAngularDirective(dir, indent);
        }
        for (AngularEvent event : content.getAngularEvents()) {
            generateAngularEvent(event, indent);
        }
        for (AngularBinding binding : content.getAngularBindings()) {
            generateAngularBinding(binding, indent);
        }
    }

    private void generateHtmlElement(HtmlElement elem, String indent) {
        String tagName = null;
        HtmlContent content = null;
        List<AngularBinding> bindings = new ArrayList<>();
        List<AngularEvent> events = new ArrayList<>();
        List<AngularDirective> directives = new ArrayList<>();

        if (elem.getDivElement() != null) {
            tagName = "div";
            content = elem.getDivElement().getHtmlContent();
            // DivElement has no direct DivAttributes; bindings/events/directives are in HtmlContent
            if (content != null) {
                bindings.addAll(content.getAngularBindings());
                events.addAll(content.getAngularEvents());
                directives.addAll(content.getAngularDirectives());
            }
        } else if (elem.getpElement() != null) {
            tagName = "p";
            content = elem.getpElement().getHtmlContent();
            if (elem.getpElement().getpAttributes() != null) {
                bindings.addAll(elem.getpElement().getpAttributes().getAngularBindings());
                // PAttributes may include interpolations, but no events/directives in your AST
            }
        } else if (elem.getImgElement() != null) {
            tagName = "img";
            if (elem.getImgElement().getImgAttributes() != null) {
                for (ImgAttributes attrs : elem.getImgElement().getImgAttributes()) {
                    if (attrs.getAngularBinding() != null) {
                        bindings.add(attrs.getAngularBinding());
                    }
                }
            }
        } else if (elem.getH2Element() != null) {
            tagName = "h2";
            content = elem.getH2Element().getHtmlContent();
            if (elem.getH2Element().getHtmlAttributes() != null) {
                bindings.addAll(elem.getH2Element().getHtmlAttributes().getAngularBindings());
                events.addAll(elem.getH2Element().getHtmlAttributes().getAngularEvents());
                directives.addAll(elem.getH2Element().getHtmlAttributes().getAngularDirectives());
            }
        } else if (elem.getGenericElement() != null) {
            tagName = elem.getGenericElement().getIdentifier();
            content = elem.getGenericElement().getHtmlContent();
            if (elem.getGenericElement().getHtmlAttributes() != null) {
                bindings.addAll(elem.getGenericElement().getHtmlAttributes().getAngularBindings());
                events.addAll(elem.getGenericElement().getHtmlAttributes().getAngularEvents());
                directives.addAll(elem.getGenericElement().getHtmlAttributes().getAngularDirectives());
            }
        }

        if (tagName != null) {
            // Handle self-closing tags like img
            boolean isSelfClosing = tagName.equals("img");
            writer.printf("%sconst elem = document.createElement('%s');\n", indent, tagName);

            // Handle structural directives (*ngFor, *ngIf)
            for (AngularDirective dir : directives) {
                generateAngularDirectiveInElement(dir, indent + "  ", "elem");
            }

            // Handle bindings
            for (AngularBinding binding : bindings) {
                String prop = binding.getBinding().replace("[", "").replace("]", "");
                if (binding.getStringLiteral() != null) {
                    writer.printf("%selem.setAttribute('%s', %s);\n", indent + "  ", prop, binding.getStringLiteral());
                } else if (binding.getAngularExpression() != null) {
                    String expr = binding.getAngularExpression().getIdentifier();
                    // Handle dot notation in expressions
                    for (DotIdentifier dotId : binding.getAngularExpression().getDotIdentifiers()) {
                        expr += "." + dotId.getIdentifier();
                    }
                    writer.printf("%selem.setAttribute('%s', this.%s);\n", indent + "  ", prop, expr);
                }
            }

            // Handle events
            for (AngularEvent event : events) {
                String eventName = event.getClickEvent().replace("(", "").replace(")", "");
                String handler = event.getStringLiteral().replaceAll("^['\"]|['\"]$", "");
                writer.printf("%selem.addEventListener('%s', () => this.%s);\n", indent + "  ", eventName, handler);
            }

            // Recursively generate child content
            if (content != null && !isSelfClosing) {
                generateHtmlContent(content, indent + "  ");
                writer.printf("%selem.appendChild(child);\n", indent + "  ");
            }

            if (!isSelfClosing) {
                writer.printf("%sparent.appendChild(elem);\n", indent);
            } else {
                writer.printf("%sparent.appendChild(elem);\n", indent); // Still append for self-closing tags
            }
        }
    }
    private void generateAngularDirectiveInElement(AngularDirective dir, String indent, String elemVar) {
        if (dir.getNgFor() != null) {
            String directiveValue = dir.getStringLiteral().replaceAll("^['\"]|['\"]$", "");
            String[] parts = directiveValue.split("of");
            String varName = parts[0].replace("let", "").trim();
            String collection = parts[1].trim();
            writer.printf("%sfor (const %s of this.%s) {\n", indent, varName, collection);
            writer.printf("%s  const child = document.createElement('%s');\n", indent, elemVar);
            // Update scope for loop variable.
            writer.printf("%s  this.%s = %s;\n", indent, varName, varName);
            writer.println(indent + "  // Child content will be appended here.");
            writer.println(indent + "}");
        } else if (dir.getNgIf() != null) {
            String condition = dir.getStringLiteral().replaceAll("^['\"]|['\"]$", "");
            writer.printf("%sif (this.%s) {\n", indent, condition);
            writer.println(indent + "  // Child content will be appended here.");
            writer.println(indent + "}");
        }
    }

    private void generateInterpolation(Interpolation interp, String indent) {
        String binding = interp.getPropertyBinding().replace("{{", "").replace("}}", "");
        writer.printf("%sconst text = document.createTextNode(this.%s);\n", indent, binding);
        writer.printf("%sparent.appendChild(text);\n", indent);
    }

    private void generateAngularDirective(AngularDirective dir, String indent) {
        // Handled within elements for structural directives; standalone directives can be added here.
    }

    private void generateAngularBinding(AngularBinding binding, String indent) {
        // Handled within elements; standalone bindings can be added here if needed.
    }

    private void generateAngularEvent(AngularEvent event, String indent) {
        // Handled within elements.
    }

    private String generateArray(Array array) {
        if (array.getArrayElements() == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        if (array.getArrayElements().getArrayElement() != null) {
            sb.append(generateArrayElement(array.getArrayElements().getArrayElement()));
        }
        for (CommaArrayElement commaElem : array.getArrayElements().getCommaArrayElements()) {
            sb.append(", ").append(generateArrayElement(commaElem.getArrayElement()));
        }
        sb.append("]");
        return sb.toString();
    }

    private String generateArrayElement(ArrayElement elem) {
        if (elem.getObject() != null) {
            return generateObject(elem.getObject());
        } else if (elem.getValue() != null) {
            return elem.getValue().toString(); // TODO: Handle complex values.
        }
        return "";
    }

    private String generateObject(AST.Object obj) {
        return "{}"; // TODO: Implement object generation.
    }
}