package AST;

public class Statement {
    ImportStatement importStatement;
    Decorator decorator;
    ComponentDefinition componentDefinition;
    VariableStatement variableStatement;
    FunctionDeclaration functionDeclaration;
    ClassDeclaration classDeclaration;
    InterfaceDeclaration interfaceDeclaration;
    ExportStatement exportStatement;
    Assignment assignment;
    String semi; // ";" — usually ignored in PHP

    // --- Getters and Setters (already provided) ---

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Statement{\n");
        if (decorator != null) {
            sb.append("  decorator=").append(decorator).append(",\n");
        }
        if (componentDefinition != null) {
            sb.append("  componentDefinition=").append(componentDefinition).append(",\n");
        }
        if (variableStatement != null) {
            sb.append("  variableStatement=").append(variableStatement).append(",\n");
        }
        if (functionDeclaration != null) {
            sb.append("  functionDeclaration=").append(functionDeclaration).append(",\n");
        }
        if (classDeclaration != null) {
            sb.append("  classDeclaration=").append(classDeclaration).append(",\n");
        }
        if (interfaceDeclaration != null) {
            sb.append("  interfaceDeclaration=").append(interfaceDeclaration).append(",\n");
        }
        if (exportStatement != null) {
            sb.append("  exportStatement=").append(exportStatement).append(",\n");
        }
        if (assignment != null) {
            sb.append("  assignment=").append(assignment).append(",\n");
        }
        if (semi != null) {
            sb.append("  semi='").append(semi).append("',\n");
        }

        // Remove trailing ",\n"
        String str = sb.toString();
        if (str.endsWith(",\n")) {
            str = str.substring(0, str.length() - 2);
        }
        return str + "\n}";
    }

    public ImportStatement getImportStatement() {
        return importStatement;
    }

    public void setImportStatement(ImportStatement importStatement) {
        this.importStatement = importStatement;
    }

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public ComponentDefinition getComponentDefinition() {
        return componentDefinition;
    }

    public void setComponentDefinition(ComponentDefinition componentDefinition) {
        this.componentDefinition = componentDefinition;
    }

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public InterfaceDeclaration getInterfaceDeclaration() {
        return interfaceDeclaration;
    }

    public void setInterfaceDeclaration(InterfaceDeclaration interfaceDeclaration) {
        this.interfaceDeclaration = interfaceDeclaration;
    }

    public ExportStatement getExportStatement() {
        return exportStatement;
    }

    public void setExportStatement(ExportStatement exportStatement) {
        this.exportStatement = exportStatement;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public String getSemi() {
        return semi;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    public String CodeGenerate(){
        StringBuilder sb = new StringBuilder();

        if (decorator != null) {
            sb.append(decorator.CodeGenerate()).append(",\n");
        }
        if (componentDefinition != null) {
            sb.append(componentDefinition.decorator.CodeGenerate()).append(",\n");
        }
        if (variableStatement != null) {
            sb.append(variableStatement.CodeGeneration()).append(",\n");
        }
        if (functionDeclaration != null) {
            sb.append(functionDeclaration.CodeGenerate()).append(",\n");
        }
        if(this instanceof ClassDeclaration){
            System.out.println(this);
            sb.append(CodeGenerate()).append(",\n");
        }
        if (classDeclaration != null) {

            sb.append(classDeclaration.CodeGenerate()).append(",\n");
        }

        if (exportStatement != null) {

            sb.append("  exportStatement=").append(exportStatement.CodeGeneration()).append(",\n");
        }
        if (assignment != null) {

            sb.append("  assignment=").append(assignment.CodeGenerate()).append(",\n");
        }
        if (semi != null) {
            sb.append("  semi='").append(semi).append("',\n");
        }
        return sb.toString();

    }
}