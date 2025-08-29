package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentPropertyList extends ASTNode {
    ComponentProperty componentProperty;
    String comma;  // "," after first property (ignored in codegen)
    List<CommaComponentProperty> commaComponentProperties = new ArrayList<>();

    public ComponentProperty getComponentProperty() {
        return componentProperty;
    }

    public void setComponentProperty(ComponentProperty componentProperty) {
        this.componentProperty = componentProperty;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public List<CommaComponentProperty> getCommaComponentProperties() {
        return commaComponentProperties;
    }

    public void setCommaComponentProperties(List<CommaComponentProperty> commaComponentProperties) {
        this.commaComponentProperties = commaComponentProperties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ComponentPropertyList{\n");

        if (componentProperty != null) {
            sb.append("  componentProperty=").append(componentProperty).append(",\n");
        }
        if (comma != null) {
            sb.append("  comma='").append(comma).append("',\n");
        }
        if (commaComponentProperties != null && !commaComponentProperties.isEmpty()) {
            sb.append("  commaComponentProperties=").append(commaComponentProperties).append(",\n");
        }

        // Remove trailing ",\n"
        if (sb.length() > 2 && sb.substring(sb.length() - 2).equals(",\n")) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("}");
        return sb.toString();
    }
}