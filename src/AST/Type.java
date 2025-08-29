package AST;

import java.util.ArrayList;
import java.util.List;

public class Type {
    String identifier;
    List<CommaIdentifier> commaIdentifiers = new ArrayList<CommaIdentifier>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<CommaIdentifier> getCommaIdentifiers() {
        return commaIdentifiers;
    }

    public void setCommaIdentifiers(List<CommaIdentifier> commaIdentifiers) {
        this.commaIdentifiers = commaIdentifiers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Type{\n");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\n');
        }

        if (commaIdentifiers != null && !commaIdentifiers.isEmpty()) {
            sb.append("commaIdentifiers=").append(commaIdentifiers).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
