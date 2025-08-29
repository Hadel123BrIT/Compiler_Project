package AST;

public class Expression extends ASTNode {
    String lbrace;              // '{' — used in object literals?
    String rbrace;              // '}' — same
    String identifier;          // e.g. "user"
    Literal literal;            // string, number, boolean
    PropertyBinding propertyBinding;  // [prop]="value" — likely not here
    TwoWayBinding twoWayBinding;      // [(ngModel)]="name"
    NgDirective ngDirective;          // *ngIf, *ngFor
    Expression expression;            // nested expression

    // --- Getters and Setters (already provided) ---


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Expression{");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\'');
        }

        if (literal != null) {
            if (sb.length() > 10) sb.append(", ");
            sb.append("literal=").append(literal);
        }

        if (propertyBinding != null) {
            if (sb.length() > 10) sb.append(", ");
            sb.append("propertyBinding=").append(propertyBinding);
        }

        if (twoWayBinding != null) {
            if (sb.length() > 10) sb.append(", ");
            sb.append("twoWayBinding=").append(twoWayBinding);
        }

        if (ngDirective != null) {
            if (sb.length() > 10) sb.append(", ");
            sb.append("ngDirective=").append(ngDirective);
        }

        if (expression != null) {
            if (sb.length() > 10) sb.append(", ");
            sb.append("expression=").append(expression);
        }

        sb.append("}");
        return sb.toString();
    }

    public String getLbrace() {
        return lbrace;
    }

    public void setLbrace(String lbrace) {
        this.lbrace = lbrace;
    }

    public String getRbrace() {
        return rbrace;
    }

    public void setRbrace(String rbrace) {
        this.rbrace = rbrace;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    public PropertyBinding getPropertyBinding() {
        return propertyBinding;
    }

    public void setPropertyBinding(PropertyBinding propertyBinding) {
        this.propertyBinding = propertyBinding;
    }

    public TwoWayBinding getTwoWayBinding() {
        return twoWayBinding;
    }

    public void setTwoWayBinding(TwoWayBinding twoWayBinding) {
        this.twoWayBinding = twoWayBinding;
    }

    public NgDirective getNgDirective() {
        return ngDirective;
    }

    public void setNgDirective(NgDirective ngDirective) {
        this.ngDirective = ngDirective;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String CodeGenerate(){
        StringBuilder sb = new StringBuilder();
        if(identifier!= null) sb.append(identifier);

        return sb.toString();
    }
}