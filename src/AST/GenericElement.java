package AST;

public class GenericElement {
    String htmlTagOpen;         // "<div", "<app-user"
    String htmlTagClose;        // ">", "/>"
    String htmlTagEnd;          // "</div>", "</app-user>"
    String identifier;          // tag name: "div", "app-card"
    HtmlAttributes htmlAttributes; // attributes (static + dynamic)
    HtmlContent htmlContent;    // inner content

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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public HtmlAttributes getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(HtmlAttributes htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GenericElement{\n");

        if (htmlTagOpen != null) {
            sb.append("  htmlTagOpen='").append(htmlTagOpen).append("',\n");
        }
        if (htmlTagClose != null) {
            sb.append("  htmlTagClose='").append(htmlTagClose).append("',\n");
        }
        if (htmlTagEnd != null) {
            sb.append("  htmlTagEnd='").append(htmlTagEnd).append("',\n");
        }
        if (identifier != null) {
            sb.append("  identifier='").append(identifier).append("',\n");
        }
        if (htmlAttributes != null) {
            sb.append("  htmlAttributes=").append(htmlAttributes).append(",\n");
        }
        if (htmlContent != null) {
            sb.append("  htmlContent=").append(htmlContent).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    // In GenericElement.java
    public String CodeGeneration(String parentVar) {
        StringBuilder sb = new StringBuilder();

        // Create the full IIFE for this element
        String elementCreation = parentVar +".appendChild((() => {\n" +
                "  const el = document.createElement('" + identifier + "');\n";

        if (htmlAttributes != null) {
            elementCreation += "  " + htmlAttributes.CodeGeneration("el") + "\n";
        }

        if (htmlContent != null) {
            // Pass "el" as parent — HtmlContent will generate children normally
            elementCreation += " " + htmlContent.CodeGeneration("el") + "\n";
        }

        elementCreation += "  return el;\n" +
                "})())";

        if (htmlAttributes != null && !htmlAttributes.getAngularDirectives().isEmpty()) {
            for (AngularDirective directive : htmlAttributes.getAngularDirectives()) {
                sb.append(directive.CodeGeneration(elementCreation, parentVar)).append("\n");
            }
        } else {
            // No directive → just append
            sb.append(elementCreation).append("\n");
        }

        return sb.toString();
    }
}