package AST;

public class CommaArrayElement extends ASTNode{
    String comma;               // "," (we can ignore it, but it's there)
    ArrayElement arrayElement;  // the actual element after the comma

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ArrayElement getArrayElement() {
        return arrayElement;
    }
    public Value getValue(){
        return this.arrayElement.getValue();
    }
    public void setArrayElement(ArrayElement arrayElement) {
        this.arrayElement = arrayElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaArrayElement{");

        if (comma != null) {
            sb.append("comma='").append(comma).append("', ");
        }
        if (arrayElement != null) {
            sb.append("arrayElement=").append(arrayElement);
        }

        sb.append("}");
        return sb.toString();
    }
}