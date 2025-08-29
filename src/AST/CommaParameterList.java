package AST;

public class CommaParameterList extends ASTNode{
    String comma;                   // "," — ignored in code generation
    ParameterList parameterList;    // the parameter(s) after the comma

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaParameterList{");

        if (comma != null) {
            sb.append("comma='").append(comma).append('\'');
        }

        if (parameterList != null) {
            if (comma != null) sb.append(", ");
            sb.append("parameterList=").append(parameterList);
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGenerate(){
        return parameterList.CodeGenerate();
    }
}