package AST;

import java.util.ArrayList;
import java.util.List;

public class PAttributes {
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
        StringBuilder sb = new StringBuilder("PAttributes{\n");

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
    public String CodeGeneration(String elementVar) {
        StringBuilder sb = new StringBuilder();

        // Handle [property] bindings like [className]="myClass"
        for (AngularBinding binding : angularBindings) {
            sb.append(binding.CodeGeneration(elementVar)).append("\n");
        }

        // Handle inline styles: [style.color] or static style=""
        for (StyleAttribute style : styleAttributes) {
            sb.append(style.CodeGeneration(elementVar)).append("\n");
        }

        // Handle {{ interpolation }} in attributes (rare, but possible)
        for (Interpolation interp : interpolations) {
            sb.append("  ").append(interp.CodeGeneration(elementVar)).append("\n");
        }

        return sb.toString();
    }
}