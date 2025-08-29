package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributes extends ASTNode {
    List<AngularBinding> angularBindings = new ArrayList<>();
    List<AngularEvent> angularEvents = new ArrayList<>();
    List<AngularDirective> angularDirectives = new ArrayList<>();
    List<StyleAttribute> styleAttributes = new ArrayList<>();
    List<SrcAttribute> srcAttributes = new ArrayList<>();
    List<AltAttribute> altAttributes = new ArrayList<>();
    List<String> stringLiterals = new ArrayList<>();

    // --- Getters and Setters ---


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlAttributes{\n");

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
            sb.append("  styleAttributes=").append(styleAttributes).append(",\n");
        }
        if (!srcAttributes.isEmpty()) {
            sb.append("  srcAttributes=").append(srcAttributes).append(",\n");
        }
        if (!altAttributes.isEmpty()) {
            sb.append("  altAttributes=").append(altAttributes).append(",\n");
        }
        if (!stringLiterals.isEmpty()) {
            sb.append("  stringLiterals=").append(stringLiterals).append("\n");
        }

        // Remove trailing ",\n"
        String str = sb.toString();
        if (str.endsWith(",\n")) {
            str = str.substring(0, str.length() - 2);
        }
        return str + "\n}";
    }

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

    public List<SrcAttribute> getSrcAttributes() {
        return srcAttributes;
    }

    public void setSrcAttributes(List<SrcAttribute> srcAttributes) {
        this.srcAttributes = srcAttributes;
    }

    public List<AltAttribute> getAltAttributes() {
        return altAttributes;
    }

    public void setAltAttributes(List<AltAttribute> altAttributes) {
        this.altAttributes = altAttributes;
    }

    public List<String> getStringLiterals() {
        return stringLiterals;
    }

    public void setStringLiterals(List<String> stringLiterals) {
        this.stringLiterals = stringLiterals;
    }



    public String CodeGeneration(String elementVar) {
        StringBuilder sb = new StringBuilder();

        // 1. Handle [property] bindings: [id]="userId" → el.id = userId;
        for (AngularBinding binding : angularBindings) {
            sb.append(binding.CodeGeneration(elementVar)).append("\n");
        }

        // 2. Handle (event) bindings: (click)="save()" → el.addEventListener('click', save);
        for (AngularEvent event : angularEvents) {
            sb.append(event.CodeGeneration(elementVar)).append("\n");
        }

        // 3. Handle style attributes: style="color:red" or [style.color]="theme"
        for (StyleAttribute style : styleAttributes) {
            sb.append(style.CodeGeneration(elementVar)).append("\n");
        }

        // 4. Handle src attributes: [src]="imgUrl" → el.src = imgUrl;
        for (SrcAttribute src : srcAttributes) {
            sb.append(src.CodeGeneration(elementVar)).append("\n");
        }

        // 5. Handle alt attributes: [alt]="desc" → el.alt = desc;
        for (AltAttribute alt : altAttributes) {
            sb.append(alt.CodeGeneration(elementVar)).append("\n");
        }

        // 6. Handle structural directives: *ngIf, *ngFor
        for (AngularDirective directive : angularDirectives) {

        }

        // 7. Static string literals (if any) — usually not used directly
        for (String literal : stringLiterals) {
            sb.append("/* Static: ").append(literal).append(" */\n");
        }

        return sb.toString();
    }

}