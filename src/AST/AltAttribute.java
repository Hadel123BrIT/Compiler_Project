package AST;

public class AltAttribute extends ASTNode{
    String alt;
    String equal;
    AngularExpression angularExpression;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public AngularExpression getAngularExpression() {
        return angularExpression;
    }

    public void setAngularExpression(AngularExpression angularExpression) {
        this.angularExpression = angularExpression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AltAttribute{\n");

        if (alt != null) {
            sb.append("  alt'").append(alt).append("\n");
        }
        if (equal != null) {
            sb.append("  equal'").append(equal).append("\n");
        }
        if (angularExpression != null) {
            sb.append("  angularExpression").append(angularExpression).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    public String CodeGeneration(String elementVar) {
        if (angularExpression.CodeGeneration() != null) {
            return elementVar + ".alt = '" + angularExpression.CodeGeneration() + "';";
        } else if (angularExpression != null) {
            return elementVar + ".alt = " + angularExpression.CodeGeneration() + ";";
        }
        return "";
    }
}
