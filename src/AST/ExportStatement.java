package AST;

public class ExportStatement {
    String export;                      // "export"
    VariableStatement variableStatement; // export const x = ...
    FunctionDeclaration functionDeclaration; // export function f()
    ClassDeclaration classDeclaration;   // export class C

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ExportStatement{\n");

        if (export != null) {
            sb.append("export='").append(export).append("'\n");
        }

        if (variableStatement != null) {
            sb.append(", variableStatement=").append(variableStatement).append("\n");
        }

        if (functionDeclaration != null) {
            sb.append(", functionDeclaration=").append(functionDeclaration).append("\n");
        }

        if (classDeclaration != null) {
            sb.append(", classDeclaration=").append(classDeclaration).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(){
        System.exit(9999999);

        StringBuilder sb = new StringBuilder();
        if(this.classDeclaration != null){
            sb.append(this.classDeclaration.CodeGenerate());
        }
        if(this.variableStatement != null){
            sb.append(this.variableStatement.CodeGeneration());
        }
        if(this.functionDeclaration != null ){
            sb.append(this.functionDeclaration.CodeGenerate());
        }
        return sb.toString();
    }
}