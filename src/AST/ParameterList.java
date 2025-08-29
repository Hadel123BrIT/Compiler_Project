package AST;

import java.util.ArrayList;
import java.util.List;

public class ParameterList extends ASTNode {
    String identifier;  // e.g. "name"
    String colon;       // ":" — ignored
    List<CommaParameterList> commaParameterLists = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public List<CommaParameterList> getCommaParameterLists() {
        return commaParameterLists;
    }

    public void setCommaParameterLists(List<CommaParameterList> commaParameterLists) {
        this.commaParameterLists = commaParameterLists;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ParameterList{");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\'');
        }

        if (colon != null) {
            sb.append(", colon='").append(colon).append('\'');
        }

        if (!commaParameterLists.isEmpty()) {
            sb.append(", commaParameterLists=").append(commaParameterLists);
        }

        sb.append("}");
        return sb.toString();
    }

    public String CodeGenerate(){
        StringBuilder st = new StringBuilder();
        st.append(identifier);
        if(!commaParameterLists.isEmpty()){
            for (CommaParameterList item : this.commaParameterLists){
                st.append(',');
                st.append(item.CodeGenerate());
            }
        }
        return st.toString();
    }
}