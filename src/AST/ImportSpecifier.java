package AST;

public class ImportSpecifier {
    String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImportSpecifier{");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\'');
        }

        sb.append("}");
        return sb.toString();
    }

}
