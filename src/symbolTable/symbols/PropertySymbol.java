package symbolTable.symbols;
import java.util.*;

/**
 * Represents a property that can be bound in an Angular template
 * (either an input or output property of a component/directive)
 */
public class PropertySymbol extends Symbol {
    public enum PropertyKind {
        INPUT,
        OUTPUT,
        TWO_WAY_BINDING
    }

    private final PropertyKind kind;
    private final TypeSymbol type;
    private final String bindingName;
    private final boolean required;
    private final String documentation;

    public PropertySymbol(String name,
                          String bindingName,
                          PropertyKind kind,
                          TypeSymbol type,
                          boolean required,
                          String documentation,
                          int line,
                          int column) {
        super(name, line, column);
        this.kind = kind;
        this.type = type;
        this.bindingName = bindingName != null ? bindingName : name;
        this.required = required;
        this.documentation = documentation;
    }

    // Factory methods for common cases
    public static PropertySymbol createInput(String name, TypeSymbol type, int line, int column) {
        return new PropertySymbol(name, null, PropertyKind.INPUT, type, false, null, line, column);
    }

    public static PropertySymbol createOutput(String name, TypeSymbol type, int line, int column) {
        return new PropertySymbol(name, null, PropertyKind.OUTPUT, type, false, null, line, column);
    }

    public static PropertySymbol createTwoWayBinding(String name, TypeSymbol type, int line, int column) {
        return new PropertySymbol(name, null, PropertyKind.TWO_WAY_BINDING, type, false, null, line, column);
    }

    // Getters
    public PropertyKind getKind() {
        return kind;
    }

    public TypeSymbol getType() {
        return type;
    }

    public String getBindingName() {
        return bindingName;
    }

    public boolean isRequired() {
        return required;
    }

    public String getDocumentation() {
        return documentation;
    }

    // Utility methods
    public boolean isInput() {
        return kind == PropertyKind.INPUT || kind == PropertyKind.TWO_WAY_BINDING;
    }

    public boolean isOutput() {
        return kind == PropertyKind.OUTPUT || kind == PropertyKind.TWO_WAY_BINDING;
    }

    @Override
    public String getSymbolType() {
        return switch (kind) {
            case INPUT -> "Input Property";
            case OUTPUT -> "Output Property";
            case TWO_WAY_BINDING -> "Two-way Binding Property";
        };
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s): %s%s",
                getSymbolType(),
                getName(),
                getBindingName(),
                type.getName(),
                required ? " [required]" : "");
    }
}
