package AST;

public class Interpolation extends ASTNode{
    String propertyBinding;  // Holds the expression string, e.g. "user.name"

    public String getPropertyBinding() {
        return propertyBinding;
    }

    public void setPropertyBinding(String propertyBinding) {
        this.propertyBinding = propertyBinding;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Interpolation{");
        if (propertyBinding != null) {
            sb.append("propertyBinding='").append(propertyBinding).append("'");
        }
        sb.append("}");
        return sb.toString();
    }

    public String CodeGeneration(String elementVar) {
        if (propertyBinding == null || propertyBinding.trim().isEmpty()) {
            return elementVar + ".textContent = '';";
        }
        String expr = propertyBinding.trim();
        if (expr.startsWith("{{") && expr.endsWith("}}")) {
            expr = expr.substring(2, expr.length() - 2).trim();
        }
        return elementVar + ".textContent = " + expr + ";";
    }
}