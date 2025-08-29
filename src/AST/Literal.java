package AST;

public class Literal extends ASTNode{
    String stringLiteral;
    String numberLiteral;
    String booleanLiteral;

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getNumberLiteral() {
        return numberLiteral;
    }

    public void setNumberLiteral(String numberLiteral) {
        this.numberLiteral = numberLiteral;
    }

    public String getBooleanLiteral() {
        return booleanLiteral;
    }

    public void setBooleanLiteral(String booleanLiteral) {
        this.booleanLiteral = booleanLiteral;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Literal{");

        if (stringLiteral != null) {
            sb.append("stringLiteral='").append(stringLiteral).append('\'');
        }

        if (numberLiteral != null) {
            if (sb.length() > 8) sb.append(", ");
            sb.append("numberLiteral='").append(numberLiteral).append('\'');
        }

        if (booleanLiteral != null) {
            if (sb.length() > 8) sb.append(", ");
            sb.append("booleanLiteral='").append(booleanLiteral).append('\'');
        }

        sb.append("}");
        return sb.toString();
    }
}