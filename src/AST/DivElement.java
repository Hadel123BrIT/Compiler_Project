package AST;

public class DivElement extends ASTNode {
    String htmlTagOpen;     // "<div"
    String htmlTagClose;    // ">"
    String htmlTagEnd;      // "</div>"
    String divTag;          // possibly "div" — redundant
    HtmlContent htmlContent; // inner content: text, {{ }}, elements

    public String getHtmlTagOpen() {
        return htmlTagOpen;
    }

    public void setHtmlTagOpen(String htmlTagOpen) {
        this.htmlTagOpen = htmlTagOpen;
    }

    public String getHtmlTagClose() {
        return htmlTagClose;
    }

    public void setHtmlTagClose(String htmlTagClose) {
        this.htmlTagClose = htmlTagClose;
    }

    public String getHtmlTagEnd() {
        return htmlTagEnd;
    }

    public void setHtmlTagEnd(String htmlTagEnd) {
        this.htmlTagEnd = htmlTagEnd;
    }

    public String getDivTag() {
        return divTag;
    }

    public void setDivTag(String divTag) {
        this.divTag = divTag;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DivElement{\n");

        if (htmlTagOpen != null) {
            sb.append("  htmlTagOpen='").append(htmlTagOpen).append("',\n");
        }
        if (htmlTagClose != null) {
            sb.append("  htmlTagClose='").append(htmlTagClose).append("',\n");
        }
        if (htmlTagEnd != null) {
            sb.append("  htmlTagEnd='").append(htmlTagEnd).append("',\n");
        }
        if (divTag != null) {
            sb.append("  divTag='").append(divTag).append("',\n");
        }
        if (htmlContent != null) {
            sb.append("  htmlContent=").append(htmlContent).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(){
        StringBuilder sb = new StringBuilder();
        sb.append("(() => {\n");
        sb.append("  const div = document.createElement('div');\n");


        // Generate inner content
        if (htmlContent != null) {
            sb.append("  ").append(htmlContent.CodeGeneration("div")).append("\n");
        }

        sb.append("  return div;\n");
        sb.append("})()");
        return sb.toString();
    }
}