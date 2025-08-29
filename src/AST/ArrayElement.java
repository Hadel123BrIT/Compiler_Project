package AST;

public class ArrayElement{
    Object object;      // Likely an AngularExpression or identifier
    Value value;        // Likely a literal: string, number, etc.

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ArrayElement{");
        boolean first = true;

        if (object != null) {
            if (!first) sb.append(", ");
            sb.append("object=").append(object);
            first = false;
        }
        if (value != null) {
            if (!first) sb.append(", ");
            sb.append("value=").append(value);
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(){
        StringBuilder sb = new StringBuilder();
        if(object != null ) sb.append(object.CodeGeneration());
        if(value != null )  sb.append(value.CodeGeneration());
        return sb.toString();
    }
}