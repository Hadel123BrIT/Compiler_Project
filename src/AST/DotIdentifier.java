package AST;

public class DotIdentifier extends ASTNode {
    String dot;         // ".", usually not null
    String identifier;  // property name, e.g. "name"

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DotIdentifier{\n");

        if (dot != null) {
            sb.append("  dot='").append(dot).append("',\n");
        }
        if (identifier != null) {
            sb.append("  identifier='").append(identifier).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }
}