package AST;

public class Array extends ASTNode{
    String arrayStart;      // "["
    String arrayEnd;        // "]"
    ArrayElements arrayElements;

    public String getArrayStart() {
        return arrayStart;
    }

    public void setArrayStart(String arrayStart) {
        this.arrayStart = arrayStart;
    }

    public String getArrayEnd() {
        return arrayEnd;
    }

    public void setArrayEnd(String arrayEnd) {
        this.arrayEnd = arrayEnd;
    }

    public ArrayElements getArrayElements() {
        return arrayElements;
    }


    public void setArrayElements(ArrayElements arrayElements) {
        this.arrayElements = arrayElements;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Array{\n");

        if (arrayStart != null) {
            sb.append("  arrayStart='").append(arrayStart).append("'\n");
        }
        if (arrayEnd != null) {
            sb.append("  arrayEnd='").append(arrayEnd).append("'\n");
        }
        if (arrayElements != null) {
            sb.append("  arrayElements=").append(arrayElements).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(arrayElements.CodeGeneration());
        sb.append("]");
        return sb.toString();
    }
}