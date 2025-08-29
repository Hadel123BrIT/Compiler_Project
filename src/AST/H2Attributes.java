package AST;

import java.util.ArrayList;
import java.util.List;

public class H2Attributes {
    List<AngularBinding> angularBindings = new ArrayList<>();
    List<Interpolation> interpolations = new ArrayList<>();
    List<StyleAttribute> styleAttributes = new ArrayList<>();

    public List<AngularBinding> getAngularBindings() {
        return angularBindings;
    }

    public void setAngularBindings(List<AngularBinding> angularBindings) {
        this.angularBindings = angularBindings;
    }

    public List<Interpolation> getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(List<Interpolation> interpolations) {
        this.interpolations = interpolations;
    }

    public List<StyleAttribute> getStyleAttributes() {
        return styleAttributes;
    }

    public void setStyleAttributes(List<StyleAttribute> styleAttributes) {
        this.styleAttributes = styleAttributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("H2Attributes{\n");

        if (!angularBindings.isEmpty()) {
            sb.append("  angularBindings=").append(angularBindings).append(",\n");
        }
        if (!interpolations.isEmpty()) {
            sb.append("  interpolations=").append(interpolations).append(",\n");
        }
        if (!styleAttributes.isEmpty()) {
            sb.append("  styleAttributes=").append(styleAttributes).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}