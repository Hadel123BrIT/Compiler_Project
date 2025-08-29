package AST;

public class ClassBody  extends ASTNode{
    VariableStatement variableStatement;
    FunctionDeclaration functionDeclaration;
    ConstructorDeclaration constructorDeclaration;

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

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassBody{");

        if (variableStatement != null) {
            sb.append("variableStatement=").append(variableStatement).append(", ");
        }
        if (functionDeclaration != null) {
            sb.append("functionDeclaration=").append(functionDeclaration).append(", ");
        }
        if (constructorDeclaration != null) {
            sb.append("constructorDeclaration=").append(constructorDeclaration);
        }

        // Remove trailing comma and space
        String s = sb.toString();
        if (s.endsWith(", ")) {
            s = s.substring(0, s.length() - 2);
        }
        return s + "}";
    }

    public String CodeGeneration(){
        StringBuilder sb = new StringBuilder();
        if(variableStatement != null )  sb.append(variableStatement.CodeGeneration());
        if(functionDeclaration != null) sb.append(functionDeclaration.CodeGenerate());
        return sb.toString();
    }
}