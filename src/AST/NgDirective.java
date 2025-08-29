package AST;

public class NgDirective {
    String equal;
    String stringLiteral;
    String directive;

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

    public String getDirective() {
        return directive;
    }

    public void setDirective(String directive) {
        this.directive = directive;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NgDirective{");

        if (directive != null) {
            sb.append("directive='").append(directive).append('\'');
        }

        if (equal != null) {
            sb.append(", equal='").append(equal).append('\'');
        }

        if (stringLiteral != null) {
            sb.append(", stringLiteral='").append(stringLiteral).append('\'');
        }

        sb.append("}");
        return sb.toString();
    }
}