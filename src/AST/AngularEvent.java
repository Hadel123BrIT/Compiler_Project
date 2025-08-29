package AST;

public class AngularEvent extends ASTNode{
    String clickEvent;   // e.g. "click", "submit", "mouseenter"
    String equal;        // "="
    String stringLiteral; // e.g. "save()", "confirmDelete()"

    // --- Getters and Setters ---
    public String getClickEvent() {
        return clickEvent;
    }

    public void setClickEvent(String clickEvent) {
        this.clickEvent = clickEvent;
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
        StringBuilder sb = new StringBuilder("AngularEvent{\n");

        if (clickEvent != null) {
            sb.append("  clickEvent='").append(clickEvent).append("'\n");
        }
        if (equal != null) {
            sb.append("  equal='").append(equal).append("'\n");
        }
        if (stringLiteral != null) {
            sb.append("  stringLiteral='").append(stringLiteral).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(String elementVar) {
        if (stringLiteral.startsWith("\"") && stringLiteral.endsWith("\"")) {
            stringLiteral = stringLiteral.substring(1, stringLiteral.length() - 1).trim();
        }
//        System.exit(9999999);

        StringBuilder sb = new StringBuilder();
        if (clickEvent != null && stringLiteral != null) {
            String evName = clickEvent.replace("(", "").replace(")", ""); // "click"
            sb.append(elementVar).append(".addEventListener('")
                    .append(evName).append("',()=> ").append(stringLiteral).append(");");
        }
        return sb.toString();
    }
}