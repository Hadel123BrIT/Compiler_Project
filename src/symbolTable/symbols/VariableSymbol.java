package symbolTable.symbols;
import java.util.*;

public class VariableSymbol extends Symbol {
    private TypeSymbol type;
    private boolean isTemplateReference;

    public VariableSymbol(String name, TypeSymbol type, boolean isTemplateRef, int line, int column) {
        super(name, line, column);
        this.type = type;
        this.isTemplateReference = isTemplateRef;
    }

    public TypeSymbol getType() {
        return type;
    }

    public boolean isTemplateReference() {
        return isTemplateReference;
    }

    @Override
    public String getSymbolType() {
        return "Variable";
    }
}
