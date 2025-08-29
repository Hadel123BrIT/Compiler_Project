package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent {
    static int id =0;
    List<HtmlElement> htmlElements = new ArrayList<>();
    List<Interpolation> interpolations = new ArrayList<>();
    List<AngularDirective> angularDirectives = new ArrayList<>();
    List<AngularEvent> angularEvents = new ArrayList<>();
    List<AngularBinding> angularBindings = new ArrayList<>();

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(List<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }

    public List<Interpolation> getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(List<Interpolation> interpolations) {
        this.interpolations = interpolations;
    }

    public List<AngularDirective> getAngularDirectives() {
        return angularDirectives;
    }

    public void setAngularDirectives(List<AngularDirective> angularDirectives) {
        this.angularDirectives = angularDirectives;
    }

    public List<AngularEvent> getAngularEvents() {
        return angularEvents;
    }

    public void setAngularEvents(List<AngularEvent> angularEvents) {
        this.angularEvents = angularEvents;
    }

    public List<AngularBinding> getAngularBindings() {
        return angularBindings;
    }

    public void setAngularBindings(List<AngularBinding> angularBindings) {
        this.angularBindings = angularBindings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlContent{\n");

        if (!htmlElements.isEmpty()) {
            sb.append("  htmlElements=").append(htmlElements).append(",\n");
        }
        if (!interpolations.isEmpty()) {
            sb.append("  interpolations=").append(interpolations).append(",\n");
        }
        if (!angularDirectives.isEmpty()) {
            sb.append("  angularDirectives=").append(angularDirectives).append(",\n");
        }
        if (!angularEvents.isEmpty()) {
            sb.append("  angularEvents=").append(angularEvents).append(",\n");
        }
        if (!angularBindings.isEmpty()) {
            sb.append("  angularBindings=").append(angularBindings).append("\n");
        }

        // Remove trailing ",\n"
        String str = sb.toString();
        if (str.endsWith(",\n")) {
            str = str.substring(0, str.length() - 2);
        }
        return str + "\n}";
    }

    private HtmlAttributes getHtmlAttributes(HtmlElement el) {
        if (el.getH2Element() != null && el.getH2Element().getHtmlAttributes() != null) {
            return el.getH2Element().getHtmlAttributes();
        } else if (el.getGenericElement() != null && el.getGenericElement().getHtmlAttributes() != null) {
            return el.getGenericElement().getHtmlAttributes();
        }
        return null;
    }

    public String CodeGeneration(String parentVar) {
        StringBuilder sb = new StringBuilder();

        for (HtmlElement el : htmlElements) {
            HtmlAttributes attrs = getHtmlAttributes(el);

            if (attrs != null && !attrs.getAngularDirectives().isEmpty()) {
                sb.append(el.CodeGeneration(parentVar));
            } else {

                sb.append(el.CodeGeneration(parentVar));
                sb.append(";\n");
            }
        }

        // Handle interpolations
        for (Interpolation interp : interpolations) {
            sb.append("  ").append(interp.CodeGeneration(parentVar)).append("\n");
        }

        return sb.toString();
    }
}