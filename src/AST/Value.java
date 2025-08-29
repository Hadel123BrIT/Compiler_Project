package AST;

public class Value {
    String stringLiteral;
    String numberLiteral;
    String booleanLiteral;
    String identifier;
    Object object;
    Array array;

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getNumberLiteral() {
        return numberLiteral;
    }

    public void setNumberLiteral(String numberLiteral) {
        this.numberLiteral = numberLiteral;
    }

    public String getBooleanLiteral() {
        return booleanLiteral;
    }

    public void setBooleanLiteral(String booleanLiteral) {
        this.booleanLiteral = booleanLiteral;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Value{\n");

        if (stringLiteral != null) {
            sb.append("stringLiteral='").append(stringLiteral).append("\n");
        }
        if (numberLiteral != null) {
            sb.append("numberLiteral='").append(numberLiteral).append("\n");
        }
        if (booleanLiteral != null) {
            sb.append("booleanLiteral='").append(booleanLiteral).append("\n");
        }
        if (identifier != null) {
            sb.append("identifier='").append(identifier).append("\n");
        }
        if (object != null) {
            sb.append("object=").append(object).append("\n");
        }
        if (array != null) {
            sb.append("array=").append(array).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(){
        StringBuilder sb = new StringBuilder();

        if (stringLiteral != null) {
            sb.append(stringLiteral);
        }
        if (numberLiteral != null) {
            sb.append(numberLiteral).append("\n");
        }
        if (booleanLiteral != null) {
            sb.append(booleanLiteral).append("\n");
        }
        if (identifier != null) {
            sb.append(identifier).append("\n");
        }
        if (object != null) {
            sb.append(object.CodeGeneration()).append("\n");
        }
        if (array != null) {
            sb.append(array.CodeGeneration()).append("\n");
        }

        return sb.toString();
    }
}
