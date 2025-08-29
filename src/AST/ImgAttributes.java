package AST;

public class ImgAttributes {
    AngularBinding angularBinding;
    StyleAttribute styleAttribute;
    SrcAttribute srcAttribute;
    AltAttribute altAttribute;

    public AngularBinding getAngularBinding() {
        return angularBinding;
    }

    public void setAngularBinding(AngularBinding angularBinding) {
        this.angularBinding = angularBinding;
    }

    public StyleAttribute getStyleAttribute() {
        return styleAttribute;
    }

    public void setStyleAttribute(StyleAttribute styleAttribute) {
        this.styleAttribute = styleAttribute;
    }

    public SrcAttribute getSrcAttribute() {
        return srcAttribute;
    }

    public void setSrcAttribute(SrcAttribute srcAttribute) {
        this.srcAttribute = srcAttribute;
    }

    public AltAttribute getAltAttribute() {
        return altAttribute;
    }

    public void setAltAttribute(AltAttribute altAttribute) {
        this.altAttribute = altAttribute;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImgAttributes{\n");

        if (angularBinding != null) {
            sb.append("  angularBinding=").append(angularBinding).append(",\n");
        }
        if (styleAttribute != null) {
            sb.append("  styleAttribute=").append(styleAttribute).append(",\n");
        }
        if (srcAttribute != null) {
            sb.append("  srcAttribute=").append(srcAttribute).append(",\n");
        }
        if (altAttribute != null) {
            sb.append("  altAttribute=").append(altAttribute).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGeneration(String elementVar) {

        StringBuilder sb = new StringBuilder();

        if (srcAttribute != null) {
            sb.append(srcAttribute.CodeGeneration(elementVar)).append("\n");
        }
        if (altAttribute != null) {
            sb.append(altAttribute.CodeGeneration(elementVar)).append("\n");
        }
        if (angularBinding != null) {
            sb.append(angularBinding.CodeGeneration(elementVar)).append("\n");
        }
        if(styleAttribute != null){
            sb.append(styleAttribute.CodeGeneration(elementVar));
        }

        return sb.toString();
    }
}