package AST;

public class StyleAttribute extends ASTNode {
    String style;
    String equal;
    String stringLiteral;
    AngularExpression angularExpression;

    public String getStyle() { return style; }
    public void setStyle(String style) { this.style = style; }
    public String getEqual() { return equal; }
    public void setEqual(String equal) { this.equal = equal; }
    public String getStringLiteral() { return stringLiteral; }
    public void setStringLiteral(String stringLiteral) { this.stringLiteral = stringLiteral; }
    public AngularExpression getAngularExpression() { return angularExpression; }
    public void setAngularExpression(AngularExpression angularExpression) { this.angularExpression = angularExpression; }

    @Override
    public String toString() {
        return "StyleAttribute{" + style + "=" + (stringLiteral != null ? stringLiteral : angularExpression) + "}";
    }

    public String CodeGeneration(String elementVar) {
        if (stringLiteral != null) {
            // Remove outer quotes: '"color: red;"' → 'color: red;'
            String css = stringLiteral.replaceAll("^\"|\"$", "");
            return elementVar + ".style.cssText = '" + css + "';";
        }
        return "";
    }
}