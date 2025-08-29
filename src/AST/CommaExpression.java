package AST;

public class CommaExpression extends ASTNode{
    String comma;           // "," — usually ignored in codegen
    Expression expression;  // the actual expression after the comma

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaExpression{");

        if (comma != null) {
            sb.append("comma='").append(comma).append('\'');
        }

        if (expression != null) {
            if (comma != null) sb.append(", ");
            sb.append("expression=").append(expression);
        }

        sb.append("}");
        return sb.toString();
    }
}