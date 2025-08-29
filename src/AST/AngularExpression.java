package AST;

import java.util.ArrayList;
import java.util.List;

public class AngularExpression{
    String identifier;
    List<DotIdentifier>dotIdentifiers=new ArrayList<DotIdentifier>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<DotIdentifier> getDotIdentifiers() {
        return dotIdentifiers;
    }

    public void setDotIdentifiers(List<DotIdentifier> dotIdentifiers) {
        this.dotIdentifiers = dotIdentifiers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AngularExpression{\n");

        if (identifier != null) {
            sb.append("  identifier='").append(identifier).append("\n");
        }
        if (dotIdentifiers != null && !dotIdentifiers.isEmpty()) {
            sb.append("  dotIdentifiers=").append(dotIdentifiers).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    public String CodeGeneration() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier);
        for (DotIdentifier dotId : dotIdentifiers) {
            sb.append(".").append(dotId.identifier);
        }
        return sb.toString();
    }

}
