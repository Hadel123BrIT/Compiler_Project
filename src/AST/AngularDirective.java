package AST;

public class AngularDirective extends ASTNode{
    String ngFor;
    String ngIf;
    String equal;
    String stringLiteral;
    boolean visited = false;

    public String getNgFor() { return ngFor; }
    public void setNgFor(String ngFor) { this.ngFor = ngFor; }
    public String getNgIf() { return ngIf; }
    public void setNgIf(String ngIf) { this.ngIf = ngIf; }
    public String getEqual() { return equal; }
    public void setEqual(String equal) { this.equal = equal; }
    public String getStringLiteral() { return stringLiteral; }
    public void setStringLiteral(String stringLiteral) { this.stringLiteral = stringLiteral; }

    @Override
    public String toString() {
        return "AngularDirective{" +
                (ngIf != null ? "ngIf='" + ngIf + "'" : "") +
                (ngFor != null ? "ngFor='" + ngFor + "'" : "") + "}";
    }


    public String CodeGeneration(String elementCreationCode, String parentVar) {
        StringBuilder sb = new StringBuilder();
        if (stringLiteral.startsWith("\"") && stringLiteral.endsWith("\"")) {
            stringLiteral = stringLiteral.substring(1, stringLiteral.length() - 1).trim();
        }

        if (ngIf != null && stringLiteral != null) {
            sb.append("if (").append(stringLiteral.trim()).append(") {\n");
            sb.append(elementCreationCode).append(";\n");
            sb.append("}\n");
        }

        // Handle *ngFor
        if (ngFor != null) {
            String[] parts = stringLiteral.split(" of ", 2);
            if (parts.length == 2) {
                String item = parts[0].replace("let ", "").trim();
                String list = parts[1].trim();
                sb.append("for (const ").append(item).append(" of ").append(list).append(") {\n");
                sb.append(elementCreationCode).append(";\n");
                sb.append("}\n");
            }
        }


        return sb.toString();
    }
}