package symbolTable.symbols;
import java.util.*;

public class ParameterSymbol extends Symbol {
    private TypeSymbol type;

    public ParameterSymbol(String name, TypeSymbol type, int line, int column) {
        super(name, line, column);
        this.type = type;
    }

    public TypeSymbol getType() {
        return type;
    }

    @Override
    public String getSymbolType() {
        return "Parameter";
    }
}
