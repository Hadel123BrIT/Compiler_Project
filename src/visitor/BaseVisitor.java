package visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbolTable.*;

import symbolTable.symbols.*;

import java.io.IOException;
import java.lang.Object;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BaseVisitor extends AngularParserBaseVisitor {
    private final ComponentSymbolTable componentSymbolTable = new ComponentSymbolTable();
    private final PropertySymbolTable propertySymbolTable = new PropertySymbolTable();
    private final TemplateVariableScopeTable templateVariableScopeTable = new TemplateVariableScopeTable();
    private final TypeSymbolTable typeSymbolTable = new TypeSymbolTable();
    private final List<String> classSymbolTable = new ArrayList<>();
    private final ModuleDependencyGraph moduleDependencyGraph = new ModuleDependencyGraph();

    private final ComponentRequirementsTable componentRequirementsTable = new ComponentRequirementsTable();

    private final FunctionsSymbolTable functionsSymbolTable= new FunctionsSymbolTable();
    private static final Set<String> HTML_TAGS = Set.of(
            "div", "p", "img", "h1", "h2", "h3", "h4", "h5", "h6",
            "span", "a", "button", "input", "textarea", "select", "option",
            "ul", "li", "ol", "table", "tr", "td", "th", "form", "label"
    );
    // Track the current component being processed
    private String currentComponentName = null;
    private int currentLine = 1; // Default line number, updated as needed

    // Helper method to update line number
    private void updateLineNumber(ParserRuleContext ctx) {
        if (ctx.getStart() != null) {
            currentLine = ctx.getStart().getLine();
        }
    }

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        String filePath = "output.js";
        Program program = new Program();

        templateVariableScopeTable.pushScope(); // Initialize global scope


        for (int i =0 ; i < ctx.statement().size() ; i++){
            if(ctx.statement(i) instanceof AngularParser.ExportStmntContext){

                program.getStatements().add((Statement) visit(ctx.statement(i)));
            }
        }

        for(int i =0 ; i < ctx.statement().size() ; i++){
            if(!(ctx.statement(i) instanceof AngularParser.ExportStmntContext))
                program.getStatements().add((Statement) visit(ctx.statement(i)));
        }





        String content = program.CodeGen();


        try {
            Files.write(Paths.get(filePath), content.getBytes(StandardCharsets.UTF_8));
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }


        return program;
    }


    @Override
    public Object visitImportStmnt(AngularParser.ImportStmntContext ctx) {
        return visitImportStatement(ctx.importStatement());

    }

    @Override
    public Object visitDecoratorLbl(AngularParser.DecoratorLblContext ctx) {
        return visitDecorator(ctx.decorator());

    }

    @Override
    public Object visitCompDef(AngularParser.CompDefContext ctx) {
        return visitComponentDefinition(ctx.componentDefinition());
    }

    @Override
    public Object visitVarStmnt(AngularParser.VarStmntContext ctx) {
        return visitVariableStatement(ctx.variableStatement());
    }

    @Override
    public Object visitFunDec(AngularParser.FunDecContext ctx) {
        return visitFunctionDeclaration(ctx.functionDeclaration());
    }

    @Override
    public Object visitClassDec(AngularParser.ClassDecContext ctx) {
        return visitClassDeclaration(ctx.classDeclaration());
    }

    @Override
    public Object visitInterfaceDec(AngularParser.InterfaceDecContext ctx) {
        return visitInterfaceDeclaration(ctx.interfaceDeclaration());
    }

    @Override
    public Object visitExportStmnt(AngularParser.ExportStmntContext ctx) {
        return visitExportStatement(ctx.exportStatement());
    }

    @Override
    public Object visitAssignmentStmnt(AngularParser.AssignmentStmntContext ctx) {
        return visitAssignment(ctx.assignment());
    }

    @Override
    public ComponentDefinition visitComponentDefinition(AngularParser.ComponentDefinitionContext ctx) {
        ComponentDefinition componentDefinition = new ComponentDefinition();

        updateLineNumber(ctx);

        // Check for a following class declaration in the parent context

        if (ctx.decorator() != null) {
            componentDefinition.setDecorator(visitDecorator(ctx.decorator()));
        }
        if (ctx.block() != null) {
            componentDefinition.setBlock((Block) visitBlock(ctx.block()));
        }

        return componentDefinition;
    }

    @Override
    public Decorator visitDecorator(AngularParser.DecoratorContext ctx) {
        Decorator decorator = new Decorator();
        updateLineNumber(ctx);

        if (ctx.AT_COMPONENT() != null) {
            decorator.setAtComponent(ctx.AT_COMPONENT().getText());
            if (ctx.componentOptions() != null) {
                decorator.setComponentOptions(visitComponentOptions(ctx.componentOptions()));
            }
        }

        if (ctx.LPAREN() != null) decorator.setLparen(ctx.LPAREN().getText());
        if (ctx.RPAREN() != null) decorator.setRparen(ctx.RPAREN().getText());
        if (ctx.LBRACE() != null) decorator.setLbrace(ctx.LBRACE().getText());
        if (ctx.RBRACE() != null) decorator.setRbrace(ctx.RBRACE().getText());

//        System.out.println(decorator.CodeGenerate());
        return decorator;
    }

    @Override
    public ComponentOptions visitComponentOptions(AngularParser.ComponentOptionsContext ctx) {
        ComponentOptions componentOptions = new ComponentOptions();
        updateLineNumber(ctx);

        if (ctx.componentPropertyList() != null) {
            componentOptions.setComponentPropertyList(visitComponentPropertyList(ctx.componentPropertyList()));
        }

        return componentOptions;
    }

    @Override
    public ComponentPropertyList visitComponentPropertyList(AngularParser.ComponentPropertyListContext ctx) {
        ComponentPropertyList componentPropertyList = new ComponentPropertyList();
        updateLineNumber(ctx);

        if (ctx.componentProperty() != null) {
            componentPropertyList.setComponentProperty(visitComponentProperty(ctx.componentProperty()));
        }
        if (ctx.COMMA() != null) {
            componentPropertyList.setComma(ctx.COMMA().getText());
        }
        if (ctx.commaComponentProperty() != null && !ctx.commaComponentProperty().isEmpty()) {
            for (AngularParser.CommaComponentPropertyContext commaCtx : ctx.commaComponentProperty()) {
                componentPropertyList.getCommaComponentProperties().add(visitCommaComponentProperty(commaCtx));
            }
        }
        return componentPropertyList;
    }

    @Override
    public CommaComponentProperty visitCommaComponentProperty(AngularParser.CommaComponentPropertyContext ctx) {
        CommaComponentProperty commaComponentProperty = new CommaComponentProperty();
        updateLineNumber(ctx);

        if (ctx.COMMA() != null) {
            commaComponentProperty.setComma(ctx.COMMA().getText());
        }
        if (ctx.componentProperty() != null) {
            commaComponentProperty.setComponentProperty(visitComponentProperty(ctx.componentProperty()));
        }

        return commaComponentProperty;
    }

    @Override
    public ComponentProperty visitComponentProperty(AngularParser.ComponentPropertyContext ctx) {
        ComponentProperty componentProperty = new ComponentProperty();
        updateLineNumber(ctx);

        if (ctx.SELECTOR() != null && ctx.StringLiteral() != null) {
            String selector = ctx.StringLiteral().getText().replaceAll("^['\"]|['\"]$", "");
            if (currentComponentName != null) {
                ComponentSymbol componentSymbol = new ComponentSymbol(currentComponentName, selector, currentLine, 0);

                System.exit(-1);
                componentSymbolTable.addComponent(currentComponentName, componentSymbol);
                componentProperty.setSelector(ctx.SELECTOR().getText());
                componentProperty.setStringLiteral(ctx.StringLiteral().getText());
            }
        }
        if (ctx.template() != null) {

            componentProperty.setTemplatet(visitTemplate(ctx.template()));


        } else if (ctx.STYLES() != null) {
            componentProperty.setStyles(ctx.STYLES().getText());
        } else if (ctx.STANDALONE() != null && ctx.TRUE() != null) {
            componentProperty.setStandalone(ctx.STANDALONE().getText());
            componentProperty.setTrue(ctx.TRUE().getText());
        } else if (ctx.IMPORTS() != null && ctx.array() != null) {
            componentProperty.setImports(ctx.IMPORTS().getText());
            componentProperty.setArray(visitArray(ctx.array()));
        }

        if (ctx.COLON() != null) componentProperty.setColon(ctx.COLON().getText());
        if (ctx.LBRACE() != null) componentProperty.setLbrace(ctx.LBRACE().getText());
        if (ctx.RBRACE() != null) componentProperty.setRbrace(ctx.RBRACE().getText());

        return componentProperty;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        updateLineNumber(ctx);

        templateVariableScopeTable.pushScope(); // Push new scope for class fields

        if (ctx.CLASS() != null) {
            classDeclaration.setClasses(ctx.CLASS().getText());
        }
        if (ctx.Identifier() != null) {
            currentComponentName = ctx.Identifier().getText();
            if(classSymbolTable.contains(currentComponentName)){
                System.out.println("InValid Class Name at Line" + currentLine);
                System.exit(-5);
            }
            classSymbolTable.add(currentComponentName);

            classDeclaration.setIdentifier(currentComponentName);
        }
        if (ctx.LBRACE() != null) {
            classDeclaration.setLbrace(ctx.LBRACE().getText());
        }
        if (ctx.RBRACE() != null) {
            classDeclaration.setRbrace(ctx.RBRACE().getText());
        }
        if (ctx.classBody() != null && !ctx.classBody().isEmpty()) {
            for (AngularParser.ClassBodyContext bodyCtx : ctx.classBody()) {
                classDeclaration.getClassBodies().add((ClassBody) visitClassBody(bodyCtx));
            }
        }
        currentComponentName = null;
//        System.out.println(classDeclaration.CodeGeneration());
        return classDeclaration;
    }


    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();

        if (ctx.variableStatement() != null) {
            VariableStatement varStmt = visitVariableStatement(ctx.variableStatement());
            classBody.setVariableStatement(varStmt);
            if (varStmt.getIdentifier() != null) {
                    String varName = varStmt.getIdentifier();
                    TypeSymbol type = new TypeSymbol("any", false, currentLine, 0);
                    VariableSymbol variableSymbol = new VariableSymbol(varName, type, false, currentLine, 0);
                    templateVariableScopeTable.getScopes().peek().put(varName, variableSymbol);
                }
        }


        if (ctx.functionDeclaration() != null) {
            classBody.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }

        if (ctx.constructorDeclaration() != null) {
            classBody.setConstructorDeclaration(visitConstructorDeclaration(ctx.constructorDeclaration()));
        }

        return classBody;
    }
    @Override
    public VariableStatement visitVariableStatement(AngularParser.VariableStatementContext ctx) {
        VariableStatement variableStatement = new VariableStatement();
        updateLineNumber(ctx);

        if (ctx.Identifier() != null) {
            for(int V = 0 ; V < ctx.Identifier().size() ; V++ ){
                String varName = ctx.Identifier(V).getText();
                TypeSymbol type = new TypeSymbol("any", false, currentLine, 0);
                VariableSymbol variableSymbol = new VariableSymbol(varName, type, false, currentLine, 0);
                templateVariableScopeTable.pushScope();
                templateVariableScopeTable.getScopes().peek().put(varName, variableSymbol);
            }
            variableStatement.setIdentifier(ctx.Identifier(0).getText());
        }

        if (ctx.COLON() != null) {
            variableStatement.setColon(ctx.COLON().getText());
        }
        if (ctx.EQUAL() != null) {
            variableStatement.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.SEMI() != null) {
            variableStatement.setSemi(ctx.SEMI().getText());
        }
        if (ctx.value().array() != null) {
            variableStatement.setArray(visitArray(ctx.value().array()));
        }

        if (ctx.array() != null) {
            variableStatement.setArray(visitArray(ctx.array()));
        }
        if (ctx.object() != null) {
            variableStatement.setObject((AST.Object) visitObject(ctx.object()));
        }
        if (ctx.value() != null) {
            variableStatement.setValue(visitValue(ctx.value()));
        }

        templateVariableScopeTable.popScope();



        return variableStatement;
    }

    @Override
    public Value visitValue(AngularParser.ValueContext ctx) {
        Value value = new Value();
        if(ctx.Identifier() !=null)
            value.setIdentifier(ctx.Identifier().getText());
        if(ctx.array() != null){
            value.setArray(visitArray(ctx.array()));
        }
        if(ctx.StringLiteral() != null){
            value.setStringLiteral(ctx.StringLiteral().getText());
        }
        if(ctx.object() != null){
            value.setObject(visitObject(ctx.object()));
        }
        if(ctx.NumberLiteral() != null ){
            value.setNumberLiteral(ctx.NumberLiteral().getText());
        }
        if(ctx.BooleanLiteral() != null){
            value.setBooleanLiteral(ctx.BooleanLiteral().getText());
        }
        return value;
    }

    @Override
    public AngularBinding visitAngularBinding(AngularParser.AngularBindingContext ctx) {
        AngularBinding angularBinding = new AngularBinding();
        updateLineNumber(ctx);

        if (ctx.BINDING() != null) {
            String binding = ctx.BINDING().getText();


            String propertyName = binding.replace("[", "").replace("]", "");
            angularBinding.setBinding(binding);

            if (currentComponentName != null) {
                TypeSymbol type = new TypeSymbol("any", false, currentLine, 0);
                PropertySymbol propertySymbol = PropertySymbol.createInput(propertyName, type, currentLine, 0);
                propertySymbolTable.getComponentProperties().computeIfAbsent(currentComponentName, k -> new HashMap<>()).put(propertyName, propertySymbol);
                componentRequirementsTable.getRequiredInputs().computeIfAbsent(currentComponentName, k -> new HashSet<>()).add(new InputSymbol(propertyName, type, false, currentLine, 0));
                angularBinding.setBinding(binding);
            }
        }

        if (ctx.EQUAL() != null) {
            angularBinding.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.StringLiteral() != null) {
            angularBinding.setStringLiteral(ctx.StringLiteral().getText());

        }
        if (ctx.angularExpression() != null) {
            angularBinding.setAngularExpression(visitAngularExpression(ctx.angularExpression()));
        }

        return angularBinding;
    }

    @Override
    public AngularExpression visitAngularExpression(AngularParser.AngularExpressionContext ctx) {
        AngularExpression angularExpression = new AngularExpression();
        updateLineNumber(ctx);

        if (ctx.Identifier() != null) {
            String identifier = ctx.Identifier().getText();
            templateVariableScopeTable.checkVariableInScope(identifier, currentLine);
            angularExpression.setIdentifier(identifier);
        }
        if (ctx.dotIdentifier() != null) {
            for (AngularParser.DotIdentifierContext dotCtx : ctx.dotIdentifier()) {
                angularExpression.getDotIdentifiers().add(visitDotIdentifier(dotCtx));
            }
        }

        return angularExpression;
    }

    @Override
    public AngularDirective visitAngularDirective(AngularParser.AngularDirectiveContext ctx) {
//        templateVariableScopeTable.popScope();
        AngularDirective directive = new AngularDirective();
        updateLineNumber(ctx);

        if (ctx.NG_FOR() != null) {
            directive.setNgFor(ctx.NG_FOR().getText());

            if (ctx.StringLiteral() != null) {
                String directiveValue = ctx.StringLiteral().getText().replaceAll("^['\"]|['\"]$", "");
                if (directiveValue.contains("let") && directiveValue.contains("of")) {
                    String[] parts = directiveValue.split("of");
                    String varPart = parts[0].trim();
                    String collection = parts[1].trim();
                    String varName = varPart.replace("let", "").trim();

                    templateVariableScopeTable.pushScope();
                    TypeSymbol type = new TypeSymbol("any", false, currentLine, 0);
                    templateVariableScopeTable.getScopes().peek().put(varName, new VariableSymbol(varName, type, true, currentLine, 0));
                    templateVariableScopeTable.checkVariableInScope(collection, currentLine);
                }
            }
        } else if (ctx.NG_IF() != null) {
            directive.setNgIf(ctx.NG_IF().getText());
            if (ctx.StringLiteral() != null) {
                String condition = ctx.StringLiteral().getText().replaceAll("^['\"]|['\"]$", "");
                templateVariableScopeTable.checkVariableInScope(condition, currentLine);
            }
        }

        if (ctx.EQUAL() != null) {
            directive.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.StringLiteral() != null) {
            directive.setStringLiteral(ctx.StringLiteral().getText());
        }

        return directive;
    }

    @Override
    public ImportStatement visitImportStatement(AngularParser.ImportStatementContext ctx) {

        ImportStatement importStatement = new ImportStatement();

        updateLineNumber(ctx);

        if (ctx.IMPORT() != null) {
            importStatement.setImport(ctx.IMPORT().getText());
        }
        if (ctx.FROM() != null) {
            importStatement.setFrom(ctx.FROM().getText());
        }
        if (ctx.SEMI() != null) {
            importStatement.setSemi(ctx.SEMI().getText());
        }
        if (ctx.StringLiteral() != null) {
            importStatement.setStringLiteral(ctx.StringLiteral().getText());
        }
        if (ctx.importClause() != null) {
            importStatement.setImportClause((ImportClause) visitImportClause(ctx.importClause()));
            if (ctx.StringLiteral() != null) {
                String modulePath = ctx.StringLiteral().getText().replaceAll("^['\"]|['\"]$", "");
                moduleDependencyGraph.getDependencies().computeIfAbsent(currentComponentName, k -> new HashSet<>()).add(modulePath);
                moduleDependencyGraph.checkForCircularDependency(currentComponentName);
            }
        }

        return importStatement;
    }

    @Override
    public Assignment visitAssignment(AngularParser.AssignmentContext ctx) {
        Assignment assignment = new Assignment();
        updateLineNumber(ctx);

        if (ctx.Identifier() != null) {
            for(int II = 0 ; II < ctx.Identifier().size() ; II++){
                String identifier = ctx.Identifier(II).getText();
                if(identifier.equals("this"))   continue;
                templateVariableScopeTable.checkVariableInScope(identifier, currentLine);
                assignment.setIdentifier(identifier);
            }
        }
        if (ctx.DOT() != null) {
            assignment.setDot(ctx.DOT().getText());
        }
        if (ctx.EQUAL() != null) {
            assignment.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.expression() != null) {
            assignment.setExpression(visitExpression(ctx.expression()));
        }

        return assignment;
    }

    @Override
    public Template visitTemplate(AngularParser.TemplateContext ctx) {
        Template template = new Template();
        updateLineNumber(ctx);

        if (ctx.BACKTICK() != null) {
            template.setBacktick(ctx.BACKTICK().toString());
        }
        if (ctx.htmlContent() != null) {
            template.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }
//        System.out.println(template.CodeGenerate());
        return template;
    }

    @Override
    public HtmlContent visitHtmlContent(AngularParser.HtmlContentContext ctx) {
        HtmlContent htmlContent = new HtmlContent();
        updateLineNumber(ctx);

        if (ctx.htmlElement() != null) {
            for (AngularParser.HtmlElementContext htmlElementCtx : ctx.htmlElement()) {
                htmlContent.getHtmlElements().add(visitHtmlElement(htmlElementCtx));
            }
        }
        if (ctx.interpolation() != null) {
            for (AngularParser.InterpolationContext interpolationCtx : ctx.interpolation()) {
                htmlContent.getInterpolations().add(visitInterpolation(interpolationCtx));
            }
        }
        if (ctx.angularDirective() != null) {
            for (AngularParser.AngularDirectiveContext angularDirectiveCtx : ctx.angularDirective()) {
                htmlContent.getAngularDirectives().add(visitAngularDirective(angularDirectiveCtx));
            }
        }
        if (ctx.angularEvent() != null) {
            for (AngularParser.AngularEventContext angularEventCtx : ctx.angularEvent()) {
                htmlContent.getAngularEvents().add(visitAngularEvent(angularEventCtx));
            }
        }
        if (ctx.angularBinding() != null) {
            for (AngularParser.AngularBindingContext angularBindingCtx : ctx.angularBinding()) {
                htmlContent.getAngularBindings().add(visitAngularBinding(angularBindingCtx));
            }
        }

        return htmlContent;
    }

    @Override
    public HtmlElement visitHtmlElement(AngularParser.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();
        updateLineNumber(ctx);

        if (ctx.divElement() != null) {
            htmlElement.setDivElement(visitDivElement(ctx.divElement()));
        }
        if (ctx.pElement() != null) {
            htmlElement.setpElement(visitPElement(ctx.pElement()));
        }
        if (ctx.imgElement() != null) {
            htmlElement.setImgElement(visitImgElement(ctx.imgElement()));
        }
        if (ctx.h2Element() != null) {
            htmlElement.setH2Element(visitH2Element(ctx.h2Element()));
        }
        if (ctx.genericElement() != null) {
            htmlElement.setGenericElement(visitGenericElement(ctx.genericElement()));
        }

        return htmlElement;
    }

    @Override
    public DivElement visitDivElement(AngularParser.DivElementContext ctx) {
        DivElement divElement = new DivElement();
        updateLineNumber(ctx);

        if (ctx.HTML_TAG_OPEN() != null) {
            divElement.setHtmlTagOpen(ctx.HTML_TAG_OPEN().getText());
        }
        if (ctx.HTML_TAG_CLOSE() != null) {
            divElement.setHtmlTagClose(ctx.HTML_TAG_CLOSE().toString());
        }
        if (ctx.HTML_TAG_END() != null) {
            divElement.setHtmlTagEnd(ctx.HTML_TAG_END().getText());
        }
        if (ctx.DIV_TAG() != null) {
            divElement.setDivTag(ctx.DIV_TAG().toString());
        }
        if (ctx.htmlContent() != null) {
            divElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }

        return divElement;
    }

    @Override
    public PElement visitPElement(AngularParser.PElementContext ctx) {
        PElement pElement = new PElement();
        updateLineNumber(ctx);

        if (ctx.HTML_TAG_OPEN() != null) {
            pElement.setHtmlTagOpen(ctx.HTML_TAG_OPEN().getText());
        }
        if (ctx.HTML_TAG_CLOSE() != null) {
            pElement.setHtmlTagClose(ctx.HTML_TAG_CLOSE().toString());
        }
        if (ctx.HTML_TAG_END() != null) {
            pElement.setHtmlTagEnd(ctx.HTML_TAG_END().getText());
        }
        if (ctx.P_TAG() != null) {
            pElement.setpTag(ctx.P_TAG().toString());
        }
        if (ctx.htmlContent() != null) {
            pElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }
        if (ctx.pAttributes() != null) {
            pElement.setpAttributes(visitPAttributes(ctx.pAttributes()));
        }

        return pElement;
    }

    @Override
    public PAttributes visitPAttributes(AngularParser.PAttributesContext ctx) {
        PAttributes pAttributes = new PAttributes();
        updateLineNumber(ctx);

        if (ctx.angularBinding() != null) {
            for (AngularParser.AngularBindingContext angularBindingCtx : ctx.angularBinding()) {
                pAttributes.getAngularBindings().add(visitAngularBinding(angularBindingCtx));
            }
        }
        if (ctx.interpolation() != null) {
            for (AngularParser.InterpolationContext interpolationCtx : ctx.interpolation()) {
                pAttributes.getInterpolations().add(visitInterpolation(interpolationCtx));
            }
        }
        if (ctx.styleAttribute() != null) {
            for (AngularParser.StyleAttributeContext styleAttributeCtx : ctx.styleAttribute()) {
                pAttributes.getStyleAttributes().add(visitStyleAttribute(styleAttributeCtx));
            }
        }

        return pAttributes;
    }

    @Override
    public ImgElement visitImgElement(AngularParser.ImgElementContext ctx) {
        ImgElement imgElement = new ImgElement();
        updateLineNumber(ctx);

        if (ctx.HTML_TAG_OPEN() != null) {
            imgElement.setHtmlTagOpen(ctx.HTML_TAG_OPEN().getText());
        }
        if (ctx.HTML_SELF_CLOSING() != null) {
            imgElement.setHtmlTagClose(ctx.HTML_SELF_CLOSING().getText());
        }
        if (ctx.Identifier() != null) {
            String identifier = ctx.Identifier().getText();
            String var = (ctx.imgAttributes(0).getText().replaceAll("\\["+"src"+"\\]=",""));

            var = (var.replaceAll("\"","" ));
            String baseVariable = var.split("\\.")[0];

            templateVariableScopeTable.checkVariableInScope(baseVariable, currentLine);
            imgElement.setIdentifier(identifier);
        }
        if (ctx.imgAttributes() != null) {
            for (AngularParser.ImgAttributesContext imgAttributesCtx : ctx.imgAttributes()) {

                imgElement.getImgAttributes().add(visitImgAttributes(imgAttributesCtx));
            }
        }

        return imgElement;
    }

    @Override
    public ImgAttributes visitImgAttributes(AngularParser.ImgAttributesContext ctx) {
        ImgAttributes imgAttributes = new ImgAttributes();
        updateLineNumber(ctx);

        if (ctx.angularBinding() != null) {
            imgAttributes.setAngularBinding(visitAngularBinding(ctx.angularBinding()));
        }
        if (ctx.styleAttribute() != null) {
            imgAttributes.setStyleAttribute(visitStyleAttribute(ctx.styleAttribute()));
        }
        if (ctx.srcAttribute() != null) {
            imgAttributes.setSrcAttribute(visitSrcAttribute(ctx.srcAttribute()));
        }
        if (ctx.altAttribute() != null) {
            imgAttributes.setAltAttribute(visitAltAttribute(ctx.altAttribute()));
        }

        return imgAttributes;
    }

    @Override
    public StyleAttribute visitStyleAttribute(AngularParser.StyleAttributeContext ctx) {
        StyleAttribute styleAttribute = new StyleAttribute();
        updateLineNumber(ctx);

        if (ctx.STYLE() != null) {
            styleAttribute.setStyle(ctx.STYLE().getText());
        }
        if (ctx.EQUAL() != null) {
            styleAttribute.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.StringLiteral() != null) {
            styleAttribute.setStringLiteral(ctx.StringLiteral().getText());
        }

        return styleAttribute;
    }

    @Override
    public SrcAttribute visitSrcAttribute(AngularParser.SrcAttributeContext ctx) {
        SrcAttribute srcAttribute = new SrcAttribute();
        updateLineNumber(ctx);

        if (ctx.Src() != null) {
            srcAttribute.setSrc(ctx.Src().getText());
        }
        if (ctx.EQUAL() != null) {
            srcAttribute.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.angularExpression() != null) {
            srcAttribute.setAngularExpression(visitAngularExpression(ctx.angularExpression()));
        }

        return srcAttribute;
    }

    @Override
    public AltAttribute visitAltAttribute(AngularParser.AltAttributeContext ctx) {
        AltAttribute altAttribute = new AltAttribute();
        updateLineNumber(ctx);

        if (ctx.Alt() != null) {
            altAttribute.setAlt(ctx.Alt().getText());
        }
        if (ctx.EQUAL() != null) {
            altAttribute.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.angularExpression() != null) {
            altAttribute.setAngularExpression(visitAngularExpression(ctx.angularExpression()));
        }

        return altAttribute;
    }

    @Override
    public H2Element visitH2Element(AngularParser.H2ElementContext ctx) {
        H2Element h2Element = new H2Element();
        updateLineNumber(ctx);

        if (ctx.HTML_TAG_OPEN() != null) {
            h2Element.setHtmlTagOpen(ctx.HTML_TAG_OPEN().getText());
         }
        if (ctx.HTML_TAG_CLOSE() != null) {
            h2Element.setHtmlTagClose(ctx.HTML_TAG_CLOSE().toString());
        }
        if (ctx.HTML_TAG_END() != null) {
            h2Element.setHtmlTagEnd(ctx.HTML_TAG_END().getText());
        }
        if (ctx.H2_TAG() != null) {
            h2Element.setH2Tag(ctx.H2_TAG().toString());
        }
        if (ctx.htmlAttributes() != null) {
            h2Element.setHtmlAttributes(visitHtmlAttributes(ctx.htmlAttributes()));
        }
        if (ctx.htmlContent() != null) {
            h2Element.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }

        return h2Element;
    }

    @Override
    public GenericElement visitGenericElement(AngularParser.GenericElementContext ctx) {
        GenericElement genericElement = new GenericElement();
        updateLineNumber(ctx);

        if (ctx.HTML_TAG_OPEN() != null) {
            genericElement.setHtmlTagOpen(ctx.HTML_TAG_OPEN().getText());
        }
        if (ctx.HTML_TAG_CLOSE() != null) {
            genericElement.setHtmlTagClose(ctx.HTML_TAG_CLOSE().toString());
        }
        if (ctx.HTML_TAG_END() != null) {
            genericElement.setHtmlTagEnd(ctx.HTML_TAG_END().getText());
        }
        if (ctx.Identifier() != null) {
            String identifier = ctx.Identifier(0).getText();
            if (!HTML_TAGS.contains(identifier.toLowerCase())) {
                componentSymbolTable.checkComponentExists(identifier, currentLine);
            }
            genericElement.setIdentifier(identifier);
        }
        if (ctx.htmlAttributes() != null) {
            genericElement.setHtmlAttributes(visitHtmlAttributes(ctx.htmlAttributes()));
        }
        if (ctx.htmlContent() != null) {
            genericElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }


        return genericElement;
    }
    @Override
    public HtmlAttributes visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx) {
        HtmlAttributes htmlAttributes = new HtmlAttributes();
        updateLineNumber(ctx);

        if (ctx.angularBinding() != null) {
            for (AngularParser.AngularBindingContext angularBindingCtx : ctx.angularBinding()) {
                htmlAttributes.getAngularBindings().add(visitAngularBinding(angularBindingCtx));
            }
        }
        if (ctx.angularEvent() != null) {
            for (AngularParser.AngularEventContext angularEventCtx : ctx.angularEvent()) {
                htmlAttributes.getAngularEvents().add(visitAngularEvent(angularEventCtx));
            }
        }
        if (ctx.angularDirective() != null) {
            for (AngularParser.AngularDirectiveContext angularDirectiveCtx : ctx.angularDirective()) {
                htmlAttributes.getAngularDirectives().add(visitAngularDirective(angularDirectiveCtx));
            }
        }
        if (ctx.styleAttribute() != null) {
            for (AngularParser.StyleAttributeContext styleAttributeCtx : ctx.styleAttribute()) {
                htmlAttributes.getStyleAttributes().add(visitStyleAttribute(styleAttributeCtx));
            }
        }
        if (ctx.srcAttribute() != null) {
            for (AngularParser.SrcAttributeContext srcAttributeCtx : ctx.srcAttribute()) {
                htmlAttributes.getSrcAttributes().add(visitSrcAttribute(srcAttributeCtx));
            }
        }
        if (ctx.altAttribute() != null) {
            for (AngularParser.AltAttributeContext altAttributeCtx : ctx.altAttribute()) {
                htmlAttributes.getAltAttributes().add(visitAltAttribute(altAttributeCtx));
            }
        }
        if (ctx.StringLiteral() != null) {
            for (TerminalNode stringLiteralNode : ctx.StringLiteral()) {
                htmlAttributes.getStringLiterals().add(stringLiteralNode.toString());
            }
        }

        return htmlAttributes;
    }

    @Override
    public DivAttributes visitDivAttributes(AngularParser.DivAttributesContext ctx) {
        DivAttributes divAttributes = new DivAttributes();
        updateLineNumber(ctx);

        if (ctx.angularBinding() != null) {
            for (AngularParser.AngularBindingContext angularBindingCtx : ctx.angularBinding()) {
                divAttributes.getAngularBindings().add(visitAngularBinding(angularBindingCtx));
            }
        }
        if (ctx.angularEvent() != null) {
            for (AngularParser.AngularEventContext angularEventCtx : ctx.angularEvent()) {
                divAttributes.getAngularEvents().add(visitAngularEvent(angularEventCtx));
            }
        }
        if (ctx.angularDirective() != null) {
            for (AngularParser.AngularDirectiveContext angularDirectiveCtx : ctx.angularDirective()) {
                divAttributes.getAngularDirectives().add(visitAngularDirective(angularDirectiveCtx));
            }
        }
        if (ctx.styleAttribute() != null) {
            for (AngularParser.StyleAttributeContext styleAttributeCtx : ctx.styleAttribute()) {
                divAttributes.getStyleAttributes().add(visitStyleAttribute(styleAttributeCtx));
            }
        }

        return divAttributes;
    }

    @Override
    public H2Attributes visitH2Attributes(AngularParser.H2AttributesContext ctx) {
        H2Attributes h2Attributes = new H2Attributes();
        updateLineNumber(ctx);

        if (ctx.angularBinding() != null) {
            for (AngularParser.AngularBindingContext angularBindingCtx : ctx.angularBinding()) {
                h2Attributes.getAngularBindings().add(visitAngularBinding(angularBindingCtx));
            }
        }
        if (ctx.interpolation() != null) {
            for (AngularParser.InterpolationContext interpolationCtx : ctx.interpolation()) {
                h2Attributes.getInterpolations().add(visitInterpolation(interpolationCtx));
            }
        }
        if (ctx.styleAttribute() != null) {
            for (AngularParser.StyleAttributeContext styleAttributeCtx : ctx.styleAttribute()) {
                h2Attributes.getStyleAttributes().add(visitStyleAttribute(styleAttributeCtx));
            }
        }

        return h2Attributes;
    }

    @Override
    public AngularEvent visitAngularEvent(AngularParser.AngularEventContext ctx) {
        AngularEvent angularEvent = new AngularEvent();
        updateLineNumber(ctx);

        if (ctx.CLICK_EVENT() != null) {

            angularEvent.setClickEvent(ctx.CLICK_EVENT().getText());
            // Get event name (e.g., "CLICK_EVENT")
            String eventName = ctx.CLICK_EVENT().getText().replace("(", "").replace(")", "");

// Get the full function call string, removing quotes first
            String funcCall = ctx.StringLiteral().getText().replaceAll("\"", "").trim();

// Split into function name and parameters
            int openParenIndex = funcCall.indexOf('(');
            if (openParenIndex == -1) {
                System.err.println("Missing opening parenthesis in function call: " + funcCall);
                System.exit(-1);
            }

            String funName = funcCall.substring(0, openParenIndex); // Function name
            String paramsStr = funcCall.substring(openParenIndex + 1, funcCall.length() - 1).trim(); // Parameters inside ()

            int paramCount = 0;
            if (!paramsStr.isEmpty()) {
                String[] params = paramsStr.split(",");
                paramCount = params.length;
            }

// Check symbol table
            functionsSymbolTable.checknumofParameters(funName, paramCount, currentLine);

            if (currentComponentName != null) {
                TypeSymbol type = new TypeSymbol("EventEmitter", false, currentLine, 0);
                PropertySymbol propertySymbol = PropertySymbol.createOutput(eventName, type, currentLine, 0);
                propertySymbolTable.getComponentProperties().computeIfAbsent(currentComponentName, k -> new HashMap<>()).put(eventName, propertySymbol);
                angularEvent.setClickEvent(ctx.CLICK_EVENT().getText());
            }
        }
        if (ctx.EQUAL() != null) {
            angularEvent.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.StringLiteral() != null) {
            angularEvent.setStringLiteral(ctx.StringLiteral().getText());
        }

        return angularEvent;
    }

    @Override
    public Interpolation visitInterpolation(AngularParser.InterpolationContext ctx) {
        Interpolation interpolation = new Interpolation();
        updateLineNumber(ctx);

        if (ctx.PROPERTY_BINDING() != null) {
            String binding = ctx.PROPERTY_BINDING().getText().replace("{{", "").replace("}}", "");
            String baseVariable = binding.split("\\.")[0];
//            templateVariableScopeTable.checkVariableInScope(baseVariable, currentLine);
            interpolation.setPropertyBinding(ctx.PROPERTY_BINDING().getText());
        }

        return interpolation;
    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        updateLineNumber(ctx);

        if (ctx.Identifier() != null) {
            String funcName = ctx.Identifier().getText();


            TypeSymbol returnType = new TypeSymbol("void", true, currentLine, 0);
            MethodSymbol methodSymbol = new MethodSymbol(funcName, returnType, currentLine, 0);
            int numpara = (1+ctx.parameterList().commaParamterList().size());
            if(numpara >= 1){
                methodSymbol.addParameter(new ParameterSymbol(ctx.parameterList().Identifier(0).getText(),new TypeSymbol(ctx.parameterList().Identifier(0).getText(),true,0,0),0,0));
                if(numpara>1){
                    for(int v = 0 ; v < ctx.parameterList().commaParamterList().size() ; v++){
                        methodSymbol.addParameter(
                                new ParameterSymbol(
                                        ctx.parameterList().commaParamterList(v).parameterList().Identifier(0).getText(),
                                        new TypeSymbol(ctx.parameterList().commaParamterList(v).parameterList().Identifier(1).getText(),
                                                true,
                                                0,
                                                0),
                                        0,0
                                )
                        );
                    }
                }
            }
            functionsSymbolTable.add(funcName, methodSymbol);

            if (currentComponentName != null) {
                propertySymbolTable.getComponentProperties().computeIfAbsent(currentComponentName, k -> new HashMap<>()).put(funcName, PropertySymbol.createInput(funcName, returnType, currentLine, 0));
            }
            functionDeclaration.setIdentifier(funcName);
        }

        if (ctx.LPAREN() != null) {
            functionDeclaration.setLparen(ctx.LPAREN().getText());
        }
        if (ctx.RPAREN() != null) {
            functionDeclaration.setRparen(ctx.RPAREN().getText());
        }
        if (ctx.parameterList() != null) {
            functionDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if (ctx.block() != null) {
            functionDeclaration.setBlock(visitBlock(ctx.block()));
        }
        return functionDeclaration;
    }

    @Override
    public Block visitBlock(AngularParser.BlockContext ctx) {
        Block block = new Block();
        List<Statement> statements = new ArrayList<>();
        for(AngularParser.StatementContext statementContext : ctx.statement()){
            Statement st = (Statement) visit(statementContext);
            statements.add(st);
        }
        block.setStatements(statements);
        return block;
    }

    @Override
    public ConstructorDeclaration visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration();
        updateLineNumber(ctx);

        if (ctx.CONSTRUCTOR() != null) {
            constructorDeclaration.setConstructor(ctx.CONSTRUCTOR().getText());
        }
        if (ctx.LPAREN() != null) {
            constructorDeclaration.setLparen(ctx.LPAREN().getText());
        }
        if (ctx.RPAREN() != null) {
            constructorDeclaration.setRparen(ctx.RPAREN().getText());
        }
        if (ctx.parameterList() != null) {
            constructorDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if (ctx.block() != null) {
            constructorDeclaration.setBlock((Block) visitBlock(ctx.block()));
        }

        return constructorDeclaration;
    }

    @Override
    public ParameterList visitParameterList(AngularParser.ParameterListContext ctx) {
        ParameterList parameterList = new ParameterList();
        updateLineNumber(ctx);

        if (ctx.Identifier() != null) {
                String paramName = ctx.Identifier(0).getText();

                if (paramName != null && templateVariableScopeTable.getScopes().peek().containsKey(paramName)) {

                    throw new SemanticError("Duplicate parameter name '" + paramName + "'", currentLine);
                }
                TypeSymbol type = new TypeSymbol("any", false, currentLine, 0);
                VariableSymbol paramSymbol = new VariableSymbol(paramName, type, false, currentLine, 0);
                templateVariableScopeTable.getScopes().peek().put(paramName, paramSymbol);
                parameterList.setIdentifier(paramName);

//            System.exit(-99);

        }
        if (ctx.COLON() != null) {
            parameterList.setColon(ctx.COLON().getText());
        }
        if (ctx.commaParamterList() != null) {
            for (AngularParser.CommaParamterListContext commaParamCtx : ctx.commaParamterList()) {
                parameterList.getCommaParameterLists().add(visitCommaParameterList(commaParamCtx));
            }
        }

        return parameterList;
    }

    public CommaParameterList visitCommaParameterList(AngularParser.CommaParamterListContext ctx) {
        CommaParameterList commaParameterList = new CommaParameterList();
        updateLineNumber(ctx);

        if (ctx.COMMA() != null) {
            commaParameterList.setComma(ctx.COMMA().getText());
        }
        if (ctx.parameterList() != null) {
            ParameterList paramList = visitParameterList(ctx.parameterList());
            commaParameterList.setParameterList(paramList);
            String paramName = paramList.getIdentifier();

        }

        return commaParameterList;
    }

    @Override
    public InterfaceDeclaration visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx) {
        InterfaceDeclaration interfaceDeclaration = new InterfaceDeclaration();
        updateLineNumber(ctx);

        if (ctx.INTERFACE() != null) {
            interfaceDeclaration.setInterface(ctx.INTERFACE().getText());
        }
        if (ctx.Identifier() != null) {
            String interfaceName = ctx.Identifier().getText();
            TypeSymbol typeSymbol = new TypeSymbol(interfaceName, false, currentLine, 0);
            typeSymbolTable.getTypes().put(interfaceName, typeSymbol);
            interfaceDeclaration.setIdentifier(interfaceName);
        }
        if (ctx.LBRACE() != null) {
            interfaceDeclaration.setLbrace(ctx.LBRACE().getText());
        }
        if (ctx.RBRACE() != null) {
            interfaceDeclaration.setRbrace(ctx.RBRACE().getText());
        }
        if (ctx.interfaceBody() != null) {
            for (AngularParser.InterfaceBodyContext bodyContext : ctx.interfaceBody()) {
                interfaceDeclaration.getInterfaceBodies().add(visitInterfaceBody(bodyContext));
            }
        }

        return interfaceDeclaration;
    }

    @Override
    public InterfaceBody visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
        InterfaceBody interfaceBody = new InterfaceBody();
        updateLineNumber(ctx);

        if (ctx.Identifier() != null) {
            String propName = ctx.Identifier().getText();
            interfaceBody.setIdentifier(propName);
        }
        if (ctx.COLON() != null) {
            interfaceBody.setColon(ctx.COLON().getText());
        }
        if (ctx.SEMI() != null) {
            interfaceBody.setSemi(ctx.SEMI().getText());
        }
        if (ctx.type() != null) {
            interfaceBody.setType(visitType(ctx.type()));
        }

        return interfaceBody;
    }

    @Override
    public Type visitType(AngularParser.TypeContext ctx) {
        Type type = new Type();
        updateLineNumber(ctx);

        if (ctx.Identifier() != null) {
            for(int IV = 0 ; IV < ctx.Identifier().size() ; IV++ ){
                String typeName = ctx.Identifier(IV).getText();
                TypeSymbol typeSymbol = new TypeSymbol(typeName, false, currentLine, 0);
                typeSymbolTable.getTypes().putIfAbsent(typeName, typeSymbol);
                type.setIdentifier(typeName);
            }
        }
        if (ctx.commaIdentifier() != null) {
            for (AngularParser.CommaIdentifierContext ciCtx : ctx.commaIdentifier()) {
                CommaIdentifier commaIdentifier = visitCommaIdentifier(ciCtx);
                type.getCommaIdentifiers().add(commaIdentifier);
            }
        }

        return type;
    }

    @Override
    public CommaIdentifier visitCommaIdentifier(AngularParser.CommaIdentifierContext ctx) {
        CommaIdentifier commaIdentifier = new CommaIdentifier();
        updateLineNumber(ctx);

        if (ctx.COMMA() != null) {
            commaIdentifier.setComma(ctx.COMMA().getText());
        }
        if (ctx.Identifier() != null) {
            String typeName = ctx.Identifier().getText();
            TypeSymbol typeSymbol = new TypeSymbol(typeName, false, currentLine, 0);
            typeSymbolTable.getTypes().putIfAbsent(typeName, typeSymbol);
            commaIdentifier.setIdentifier(typeName);
        }

        return commaIdentifier;
    }

    @Override
    public Expression visitExpression(AngularParser.ExpressionContext ctx) {
        Expression expression = new Expression();
        updateLineNumber(ctx);

        if (ctx.LPAREN() != null) {
            expression.setLbrace(ctx.LPAREN().getText());
        }
        if (ctx.RPAREN() != null) {
            expression.setRbrace(ctx.RPAREN().getText());
        }
        if (ctx.Identifier() != null) {
            String identifier = ctx.Identifier().getText();
            templateVariableScopeTable.checkVariableInScope(identifier, currentLine);
            expression.setIdentifier(identifier);
        }
        if (ctx.literal() != null) {
            expression.setLiteral(visitLiteral(ctx.literal()));
        }
        if (ctx.propertyBinding() != null) {
            expression.setPropertyBinding(visitPropertyBinding(ctx.propertyBinding()));
        }
        if (ctx.twoWayBinding() != null) {
            expression.setTwoWayBinding(visitTwoWayBinding(ctx.twoWayBinding()));
        }
        if (ctx.ngDirective() != null) {
            expression.setNgDirective(visitNgDirective(ctx.ngDirective()));
        }
        if (ctx.expression() != null) {
            expression.setExpression(visitExpression(ctx.expression()));
        }

        return expression;
    }

    @Override
    public Literal visitLiteral(AngularParser.LiteralContext ctx) {
        Literal literal = new Literal();
        updateLineNumber(ctx);

        if (ctx.StringLiteral() != null) {
            literal.setStringLiteral(ctx.StringLiteral().getText());
        }
        if (ctx.NumberLiteral() != null) {
            literal.setNumberLiteral(ctx.NumberLiteral().getText());
        }
        if (ctx.BooleanLiteral() != null) {
            literal.setBooleanLiteral(ctx.BooleanLiteral().getText());
        }

        return literal;
    }

    @Override
    public PropertyBinding visitPropertyBinding(AngularParser.PropertyBindingContext ctx) {
        PropertyBinding propertyBinding = new PropertyBinding();
        updateLineNumber(ctx);

        if (ctx.BINDING() != null) {
            String binding = ctx.BINDING().getText();
            String propertyName = binding.replace("[", "").replace("]", "");
            if (currentComponentName != null) {
                TypeSymbol type = new TypeSymbol("any", false, currentLine, 0);
                PropertySymbol propertySymbol = PropertySymbol.createInput(propertyName, type, currentLine, 0);
                propertySymbolTable.getComponentProperties().computeIfAbsent(currentComponentName, k -> new HashMap<>()).put(propertyName, propertySymbol);
                propertyBinding.setBinding(binding);
            }
        }
        if (ctx.EQUAL() != null) {
            propertyBinding.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.StringLiteral() != null) {
            propertyBinding.setStringLiteral(ctx.StringLiteral().getText());
        }

        return propertyBinding;
    }

    @Override
    public TwoWayBinding visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx) {
        TwoWayBinding twoWayBinding = new TwoWayBinding();
        updateLineNumber(ctx);

        if (ctx.TWO_WAY_BINDING() != null) {
            String binding = ctx.TWO_WAY_BINDING().getText();
            String propertyName = binding.replace("[(", "").replace(")]", "");
            if (currentComponentName != null) {
                TypeSymbol type = new TypeSymbol("any", false, currentLine, 0);
                PropertySymbol propertySymbol = PropertySymbol.createTwoWayBinding(propertyName, type, currentLine, 0);
                propertySymbolTable.getComponentProperties().computeIfAbsent(currentComponentName, k -> new HashMap<>()).put(propertyName, propertySymbol);
                twoWayBinding.setTowWayBinding(binding);
            }
        }
        if (ctx.EQUAL() != null) {
            twoWayBinding.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.StringLiteral() != null) {
            twoWayBinding.setStringLiteral(ctx.StringLiteral().getText());
        }

        return twoWayBinding;
    }

    @Override
    public NgDirective visitNgDirective(AngularParser.NgDirectiveContext ctx) {
        NgDirective ngDirective = new NgDirective();
        updateLineNumber(ctx);

        if (ctx.DIRECTIVE() != null) {
            String directiveName = ctx.DIRECTIVE().getText();
            ngDirective.setDirective(directiveName);
        }
        if (ctx.EQUAL() != null) {
            ngDirective.setEqual(ctx.EQUAL().getText());
        }
        if (ctx.StringLiteral() != null) {
            ngDirective.setStringLiteral(ctx.StringLiteral().getText());
        }

        return ngDirective;
    }

    @Override
    public DotIdentifier visitDotIdentifier(AngularParser.DotIdentifierContext ctx) {
        DotIdentifier dotIdentifier = new DotIdentifier();
        updateLineNumber(ctx);

        if (ctx.DOT() != null) {
            dotIdentifier.setDot(ctx.DOT().getText());
        }
        if (ctx.Identifier() != null) {
            String identifier = ctx.Identifier().getText();
            templateVariableScopeTable.checkVariableInScope(identifier, currentLine);
            dotIdentifier.setIdentifier(identifier);
        }

        return dotIdentifier;
    }

    @Override
    public Array visitArray(AngularParser.ArrayContext ctx) {
        Array array = new Array();
        updateLineNumber(ctx);

        if (ctx.ARRAY_START() != null) {
            array.setArrayStart(ctx.ARRAY_START().getText());
        }
        if (ctx.ARRAY_END() != null) {
            array.setArrayEnd(ctx.ARRAY_END().getText());
        }
        if (ctx.arrayElements() != null) {
            array.setArrayElements(visitArrayElements(ctx.arrayElements()));
        }

        return array;
    }

    @Override
    public ArrayElements visitArrayElements(AngularParser.ArrayElementsContext ctx) {
        ArrayElements arrayElements = new ArrayElements();
        updateLineNumber(ctx);

        if (ctx.arrayElement() != null) {
            arrayElements.setArrayElement(visitArrayElement(ctx.arrayElement()));
        }
        if (ctx.commaArrayElement() != null) {
            ctx.commaArrayElement().forEach(commaElementCtx -> {
                arrayElements.getCommaArrayElements().add(visitCommaArrayElement(commaElementCtx));
            });
        }

        return arrayElements;
    }

    @Override
    public CommaArrayElement visitCommaArrayElement(AngularParser.CommaArrayElementContext ctx) {
        CommaArrayElement commaArrayElement = new CommaArrayElement();
        updateLineNumber(ctx);

        if (ctx.COMMA() != null) {
            commaArrayElement.setComma(ctx.COMMA().getText());
        }
        if (ctx.arrayElement() != null) {
            commaArrayElement.setArrayElement(visitArrayElement(ctx.arrayElement()));
        }

        return commaArrayElement;
    }

    @Override
    public ArrayElement visitArrayElement(AngularParser.ArrayElementContext ctx) {
        ArrayElement arrayElement = new ArrayElement();
        updateLineNumber(ctx);

        if (ctx.object() != null) {
            arrayElement.setObject(visitObject(ctx.object()));
        }
        if (ctx.value() != null) {
            arrayElement.setValue( visitValue(ctx.value()));
        }

        return arrayElement;
    }

    public Property visitProperty(AngularParser.PropertyContext ctx){
        Property property = new Property();
        if(ctx.Identifier() != null) property.setIdentifier(ctx.Identifier().getText());
        if(ctx.value() != null) property.setValue(visitValue(ctx.value()));
        if(ctx.StringLiteral()!=null) property.setStringLiteral(ctx.StringLiteral().getText());
        return property;
    }
    public CommaProperty visitCommaProperty(AngularParser.CommaPropertyContext ctx){
        CommaProperty commaProperty = new CommaProperty();
        commaProperty.setProperty(visitProperty(ctx.property()));
        return commaProperty;
    }
    public AST.Object visitObject(AngularParser.ObjectContext ctx){
        AST.Object object = new AST.Object();
        object.setProperty(visitProperty(ctx.property()));
        List<CommaProperty> commaProperties = new ArrayList<>();
        for(AngularParser.CommaPropertyContext item : ctx.commaProperty()){
            commaProperties.add(visitCommaProperty(item));
        }
        object.setCommaProperties(commaProperties);

        return object;
    }
    // Getters for testing or further extensions
    public ComponentSymbolTable getComponentSymbolTable() {
        return componentSymbolTable;
    }

    public PropertySymbolTable getPropertySymbolTable() {
        return propertySymbolTable;
    }

    public TemplateVariableScopeTable getTemplateVariableScopeTable() {
        return templateVariableScopeTable;
    }
}