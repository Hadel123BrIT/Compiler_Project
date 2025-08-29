package AST;

public class CommaComponentProperty {
    String comma;                   // "," — ignored in codegen
    ComponentProperty componentProperty;  // the actual key-value pair

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ComponentProperty getComponentProperty() {
        return componentProperty;
    }

    public void setComponentProperty(ComponentProperty componentProperty) {
        this.componentProperty = componentProperty;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaComponentProperty{\n");

        if (comma != null) {
            sb.append("  comma='").append(comma).append("',\n");
        }
        if (componentProperty != null) {
            sb.append("  componentProperty=").append(componentProperty).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}