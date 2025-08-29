package AST;

public class ComponentOptions extends ASTNode {
    ComponentPropertyList componentPropertyList;

    public ComponentPropertyList getComponentPropertyList() {
        return componentPropertyList;
    }

    public void setComponentPropertyList(ComponentPropertyList componentPropertyList) {
        this.componentPropertyList = componentPropertyList;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ComponentOptions{\n");

        if (componentPropertyList != null) {
            sb.append("  componentPropertyList=").append(componentPropertyList).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}