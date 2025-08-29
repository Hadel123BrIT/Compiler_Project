package AST;

public class VariableStatement  extends ASTNode {
    String identifier;
    String colon;
    String equal;
    String semi;
    Value value;
    Array array;
    Object object;

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

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getSemi() {
        return semi;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VariableStatement{\n");

        if (identifier != null) {
            sb.append("  identifier='").append(identifier).append("',\n");
        }
        if (colon != null) {
            sb.append("  colon='").append(colon).append("',\n");
        }
        if (equal != null) {
            sb.append("  equal='").append(equal).append("',\n");
        }
        if (semi != null) {
            sb.append("  semi='").append(semi).append("',\n");
        }
        if (value != null) {
            sb.append("  value=").append(value).append(",\n");
        }
        if (array != null) {
            sb.append("  array=").append(array).append(",\n");
        }
        if (object != null) {
            sb.append("  object=").append(object).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    public String CodeGeneration(){
        StringBuilder sb = new StringBuilder();
        sb.append("let ");
        sb.append(identifier);
        sb.append(" = ");
        if(value !=null ){
            sb.append(value.CodeGeneration());
        }
        if(object != null){
            sb.append(object.CodeGeneration());
            sb.append('\n');
        }
        sb.append(";\n");
        return sb.toString();
    }
}