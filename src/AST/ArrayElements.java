package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayElements extends ASTNode {
    ArrayElement arrayElement;
    List<CommaArrayElement> commaArrayElements = new ArrayList<>();

    public ArrayElement getArrayElement() {
        return arrayElement;
    }

    public void setArrayElement(ArrayElement arrayElement) {
        this.arrayElement = arrayElement;
    }

    public List<CommaArrayElement> getCommaArrayElements() {
        return commaArrayElements;
    }

    public void setCommaArrayElements(List<CommaArrayElement> commaArrayElements) {
        this.commaArrayElements = commaArrayElements;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ArrayElements{\n");

        if (arrayElement != null) {
            sb.append("  arrayElement=").append(arrayElement).append(",\n");
        }
        if (commaArrayElements != null && !commaArrayElements.isEmpty()) {
            sb.append("  commaArrayElements=").append(commaArrayElements).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(){
        StringBuilder sb = new StringBuilder();
        sb.append(arrayElement.CodeGeneration());
        for(CommaArrayElement item : commaArrayElements){
            sb.append(",");
            sb.append(item.arrayElement.CodeGeneration());
            sb.append('\n');
        }
        return sb.toString();
    }
}