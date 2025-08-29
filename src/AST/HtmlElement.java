package AST;

public class HtmlElement {
    DivElement divElement;
    PElement pElement;
    ImgElement imgElement;
    H2Element h2Element;
    GenericElement genericElement;

    public DivElement getDivElement() {
        return divElement;
    }

    public void setDivElement(DivElement divElement) {
        this.divElement = divElement;
    }

    public PElement getpElement() {
        return pElement;
    }

    public void setpElement(PElement pElement) {
        this.pElement = pElement;
    }

    public ImgElement getImgElement() {
        return imgElement;
    }

    public HtmlAttributes getHtmlAttributes() {
        if (this.getH2Element() != null && this.getH2Element().getHtmlAttributes() != null) {
            return this.getH2Element().getHtmlAttributes();
        } else if (this.getGenericElement() != null && this.getGenericElement().getHtmlAttributes() != null) {
            return this.getGenericElement().getHtmlAttributes();
        }
        return null;
    }
    public void setImgElement(ImgElement imgElement) {
        this.imgElement = imgElement;
    }

    public H2Element getH2Element() {
        return h2Element;
    }

    public void setH2Element(H2Element h2Element) {
        this.h2Element = h2Element;
    }

    public GenericElement getGenericElement() {
        return genericElement;
    }

    public void setGenericElement(GenericElement genericElement) {
        this.genericElement = genericElement;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlElement{\n");

        if (divElement != null) {
            sb.append("  divElement=").append(divElement).append(",\n");
        }
        if (pElement != null) {
            sb.append("  pElement=").append(pElement).append(",\n");
        }
        if (imgElement != null) {
            sb.append("  imgElement=").append(imgElement).append(",\n");
        }
        if (h2Element != null) {
            sb.append("  h2Element=").append(h2Element).append(",\n");
        }
        if (genericElement != null) {
            sb.append("  genericElement=").append(genericElement).append("\n");
        }

        // Remove trailing ",\n"
        String str = sb.toString();
        if (str.endsWith(",\n")) {
            str = str.substring(0, str.length() - 2);
        }
        return str + "\n}";
    }
    public String CodeGeneration(String parentVar){
        StringBuilder sb = new StringBuilder();
        if(divElement != null){
            sb.append(divElement.CodeGeneration());
        }
        if(pElement != null){
            sb.append(pElement.CodeGeneration());
        }
        if(imgElement != null){
            sb.append(imgElement.CodeGeneration(parentVar));
        }
        if (h2Element != null){
            sb.append(h2Element.CodeGeneration());
        }
        if(genericElement != null){
            sb.append(genericElement.CodeGeneration(parentVar));
        }

        return sb.toString();
    }
}