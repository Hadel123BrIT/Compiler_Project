package AST;

public class Template extends ASTNode {
    String backtick;        // "`" — ignored
    HtmlContent htmlContent;

    public String getBacktick() {
        return backtick;
    }

    public void setBacktick(String backtick) {
        this.backtick = backtick;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Template{\n");

        if (backtick != null) {
            sb.append("  backtick='").append(backtick).append("',\n");
        }
        if (htmlContent != null) {
            sb.append("  htmlContent=").append(htmlContent).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    public String CodeGenerate(){
        StringBuilder sb = new StringBuilder();
        sb.append("render();");
        sb.append("function render() {");
        sb.append("const main = document.getElementById('app');").append("\n");
        sb.append(" main.innerHTML = '';").append("\n");
        sb.append(this.htmlContent.CodeGeneration("main")).append("\n");
        sb.append("}");
        return sb.toString();
    }
}