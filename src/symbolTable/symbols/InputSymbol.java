package symbolTable.symbols;
import java.util.*;

public class InputSymbol extends Symbol {
    private boolean required;
    private TypeSymbol type;

    public InputSymbol(String name, TypeSymbol type, boolean required, int line, int column) {
        super(name, line, column);
        this.type = type;
        this.required = required;
    }

    public TypeSymbol getType() {
        return type;
    }

    public boolean isRequired() {
        return required;
    }

    @Override
    public String getSymbolType() {
        return "Input";
    }
}
