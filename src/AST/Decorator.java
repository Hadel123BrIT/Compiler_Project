package AST;

public class Decorator extends Statement {
    String atComponent;           // "@Component"
    String lparen;                // "("
    String rparen;                // ")"
    String lbrace;                // "{"
    String rbrace;                // "}"
    ComponentOptions componentOptions; // { selector: ..., templateUrl: ... }

    public String getAtComponent() {
        return atComponent;
    }

    public void setAtComponent(String atComponent) {
        this.atComponent = atComponent;
    }

    public String getLparen() {
        return lparen;
    }

    public void setLparen(String lparen) {
        this.lparen = lparen;
    }

    public String getRparen() {
        return rparen;
    }

    public void setRparen(String rparen) {
        this.rparen = rparen;
    }

    public String getLbrace() {
        return lbrace;
    }

    public void setLbrace(String lbrace) {
        this.lbrace = lbrace;
    }

    public String getRbrace() {
        return rbrace;
    }

    public void setRbrace(String rbrace) {
        this.rbrace = rbrace;
    }

    public ComponentOptions getComponentOptions() {
        return componentOptions;
    }

    public void setComponentOptions(ComponentOptions componentOptions) {
        this.componentOptions = componentOptions;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Decorator{\n");

        if (atComponent != null) {
            sb.append("  atComponent='").append(atComponent).append("',\n");
        }
        if (lparen != null) {
            sb.append("  lparen='").append(lparen).append("',\n");
        }
        if (rparen != null) {
            sb.append("  rparen='").append(rparen).append("',\n");
        }
        if (lbrace != null) {
            sb.append("  lbrace='").append(lbrace).append("',\n");
        }
        if (rbrace != null) {
            sb.append("  rbrace='").append(rbrace).append("',\n");
        }
        if (componentOptions != null) {
            sb.append("  componentOptions=").append(componentOptions).append(",\n");
        }

        // Remove trailing ",\n"
        if (sb.lastIndexOf(",\n") == sb.length() - 2) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGenerate(){
        StringBuilder sb = new StringBuilder();
        for(CommaComponentProperty item : this.componentOptions.componentPropertyList.commaComponentProperties){
            if(item.componentProperty.getTemplatet() != null){
                sb.append(item.componentProperty.getTemplatet().CodeGenerate());
            }
        }
         return sb.toString();
    }
}