package AST;

import java.util.ArrayList;
import java.util.List;

public class Object extends ASTNode {
    String lbrace;
    String rbrace;
    Property property;
    List<CommaProperty> commaProperties=new ArrayList<CommaProperty>();

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

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public List<CommaProperty> getCommaProperties() {
        return commaProperties;
    }

    public void setCommaProperties(List<CommaProperty> commaProperties) {
        this.commaProperties = commaProperties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Object{");

        if (lbrace != null) {
            sb.append("lbrace='").append(lbrace).append("', ").append("\n");
        }
        if (rbrace != null) {
            sb.append("rbrace='").append(rbrace).append("', ").append("\n");
        }
        if (property != null) {
            sb.append("property=").append(property).append(", ").append("\n");
        }
        if (!commaProperties.isEmpty()) {
            sb.append("commaProperties=").append(commaProperties).append("\n");;
        }

        sb.append("}");
        return sb.toString();
    }

    public String CodeGeneration(){
        StringBuilder sb = new StringBuilder();
        sb.append("{\n\t");
        sb.append(property.identifier);
        sb.append(":");
        sb.append(property.value.CodeGeneration());
        if(!commaProperties.isEmpty()){
            for(CommaProperty item : commaProperties){
                sb.append(",\t");
                sb.append(item.property.CodeGeneration());
            }
        }
        sb.append('\n');
        sb.append("}");
        sb.append('\n');

        return sb.toString();
    }

}
