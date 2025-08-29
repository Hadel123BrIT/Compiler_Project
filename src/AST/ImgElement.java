package AST;

import java.util.ArrayList;
import java.util.List;

public class ImgElement {
    String htmlTagOpen;                 // "<img"
    String htmlTagClose;                // "/>", ">"
    String identifier;                  // "img" (optional)
    List<ImgAttributes> imgAttributes = new ArrayList<>();

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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<ImgAttributes> getImgAttributes() {
        return imgAttributes;
    }

    public void setImgAttributes(List<ImgAttributes> imgAttributes) {
        this.imgAttributes = imgAttributes;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImgElement{\n");

        if (htmlTagOpen != null) {
            sb.append("  htmlTagOpen='").append(htmlTagOpen).append("',\n");
        }
        if (htmlTagClose != null) {
            sb.append("  htmlTagClose='").append(htmlTagClose).append("',\n");
        }
        if (identifier != null) {
            sb.append("  identifier='").append(identifier).append("',\n");
        }
        if (imgAttributes != null && !imgAttributes.isEmpty()) {
            sb.append("  imgAttributes=").append(imgAttributes).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(String prentVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(prentVar).append(".appendChild(");
        sb.append("(() => {\n");
        sb.append("  const img = document.createElement('img');\n");

        if (imgAttributes != null) {
            for (ImgAttributes attr : imgAttributes) {
                sb.append("  ").append(attr.CodeGeneration("img")).append("\n");
            }
        }

        sb.append("  return img;\n");
        sb.append("})())");

        return sb.toString();
    }
}