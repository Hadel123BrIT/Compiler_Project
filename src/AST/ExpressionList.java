package AST;

import java.util.ArrayList;
import java.util.List;

public class ExpressionList {
    Expression expression;                    // first expression
    List<CommaExpression> commaExpressions = new ArrayList<>(); // rest: , b, , c

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<CommaExpression> getCommaExpressions() {
        return commaExpressions;
    }

    public void setCommaExpressions(List<CommaExpression> commaExpressions) {
        this.commaExpressions = commaExpressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ExpressionList{");

        if (expression != null) {
            sb.append("expression=").append(expression);
        }

        if (!commaExpressions.isEmpty()) {
            if (sb.length() > 13) sb.append(", ");
            sb.append("commaExpressions=").append(commaExpressions);
        }

        sb.append("}");
        return sb.toString();
    }
}