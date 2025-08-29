package AST;

public class PropertyBinding extends ASTNode {
    String Binding;           // Property name: "value", "title", "disabled"
    String equal;             // "=" (ignored)
    String stringLiteral;     // Bound expression: "username", "user.name"

    public String getBinding() {
        return Binding;
    }

    public void setBinding(String binding) {
        Binding = binding;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PropertyBinding{\n");

        if (Binding != null) {
            sb.append("Binding='").append(Binding).append("'\n");
        }

        if (equal != null) {
            sb.append("equal='").append(equal).append("'\n");
        }

        if (stringLiteral != null) {
            sb.append("stringLiteral='").append(stringLiteral).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }
}