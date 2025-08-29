package AST;

public class Assignment extends Statement{
    String identifier;
    String dot;
    String equal;
    Expression expression;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Assignment{\n");

        if (identifier != null) {
            sb.append("  identifier='").append(identifier).append("',\n");
        }
        if (dot != null) {
            sb.append("  dot='").append(dot).append("',\n");
        }
        if (equal != null) {
            sb.append("  equal='").append(equal).append("',\n");
        }
        if (expression != null) {
            sb.append("  expression=").append(expression).append(",\n");
        }

        // Remove trailing comma and newline
        int lastComma = sb.lastIndexOf(",\n");
        if (lastComma == sb.length() - 2) {
            sb.delete(lastComma, sb.length());
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGenerate(){
        StringBuilder sb = new StringBuilder();
        sb.append(identifier);
        sb.append(" = ");
        sb.append(expression.CodeGenerate());
        sb.append(";\n");
        return sb.toString();
    }
}