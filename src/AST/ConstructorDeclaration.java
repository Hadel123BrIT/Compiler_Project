package AST;

public class ConstructorDeclaration extends ASTNode {
    String constructor;         // "constructor"
    String lparen;              // "("
    String rparen;              // ")"
    ParameterList parameterList; // parameters: name, age, etc.
    Block block;                // constructor body

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getLparen() {
        return lparen;
    }

    public void setLparen(String lparen) {
        this.lparen = lparen;
    }

    public String getRparen() {
        return rparen;
    }

    public void setRparen(String rparen) {
        this.rparen = rparen;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ConstructorDeclaration{");

        if (constructor != null) {
            sb.append("constructor='").append(constructor).append('\'').append(", ");
        }
        if (lparen != null) {
            sb.append("lparen='").append(lparen).append('\'').append(", ");
        }
        if (rparen != null) {
            sb.append("rparen='").append(rparen).append('\'').append(", ");
        }
        if (parameterList != null) {
            sb.append("parameterList=").append(parameterList).append(", ");
        }
        if (block != null) {
            sb.append("block=").append(block);
        }

        // Remove trailing ", "
        if (sb.length() > 2 && sb.substring(sb.length() - 2).equals(", ")) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("}");
        return sb.toString();
    }
}