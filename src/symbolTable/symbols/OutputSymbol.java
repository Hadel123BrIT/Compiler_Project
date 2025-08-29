package symbolTable.symbols;
import java.util.*;

public class OutputSymbol extends Symbol {
    private TypeSymbol eventType;

    public OutputSymbol(String name, TypeSymbol eventType, int line, int column) {
        super(name, line, column);
        this.eventType = eventType;
    }

    public TypeSymbol getEventType() {
        return eventType;
    }

    @Override
    public String getSymbolType() {
        return "Output";
    }
}
