package AST;

import java.util.ArrayList;
import java.util.List;

public class DivAttributes {
    List<AngularBinding> angularBindings = new ArrayList<>();
    List<AngularEvent> angularEvents = new ArrayList<>();
    List<AngularDirective> angularDirectives = new ArrayList<>();
    List<StyleAttribute> styleAttributes = new ArrayList<>();

    public List<AngularBinding> getAngularBindings() {
        return angularBindings;
    }

    public void setAngularBindings(List<AngularBinding> angularBindings) {
        this.angularBindings = angularBindings;
    }

    public List<AngularEvent> getAngularEvents() {
        return angularEvents;
    }

    public void setAngularEvents(List<AngularEvent> angularEvents) {
        this.angularEvents = angularEvents;
    }

    public List<AngularDirective> getAngularDirectives() {
        return angularDirectives;
    }

    public void setAngularDirectives(List<AngularDirective> angularDirectives) {
        this.angularDirectives = angularDirectives;
    }

    public List<StyleAttribute> getStyleAttributes() {
        return styleAttributes;
    }

    public void setStyleAttributes(List<StyleAttribute> styleAttributes) {
        this.styleAttributes = styleAttributes;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder("DivAttributes{\n");

        if (!angularBindings.isEmpty()) {
            sb.append("  angularBindings=").append(angularBindings).append(",\n");
        }
        if (!angularEvents.isEmpty()) {
            sb.append("  angularEvents=").append(angularEvents).append(",\n");
        }
        if (!angularDirectives.isEmpty()) {
            sb.append("  angularDirectives=").append(angularDirectives).append(",\n");
        }
        if (!styleAttributes.isEmpty()) {
            sb.append("  styleAttributes=").append(styleAttributes).append("\n");
        }

        // Remove trailing comma and newline
        String str = sb.toString();
        if (str.endsWith(",\n")) {
            str = str.substring(0, str.length() - 2);
        }
        return str + "\n}";
    }
    public String CodeGeneration(String elementVar) {
        StringBuilder sb = new StringBuilder();

        for (AngularBinding binding : angularBindings) {
            sb.append("  ").append(binding.CodeGeneration(elementVar)).append("\n");
        }

        for (StyleAttribute style : styleAttributes) {
            sb.append("  ").append(style.CodeGeneration(elementVar)).append("\n");
        }

        for (AngularEvent event : angularEvents) {
            sb.append("  ").append(event.CodeGeneration(elementVar)).append("\n");
        }

        // Add more: src, alt, etc.

        return sb.toString();
    }
}