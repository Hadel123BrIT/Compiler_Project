package symbolTable.symbols;
import java.util.*;

public class ServiceSymbol extends Symbol {
    private Map<String, MethodSymbol> methods = new HashMap<>();

    public ServiceSymbol(String name, int line, int column) {
        super(name, line, column);
    }

    public void addMethod(MethodSymbol method) {
        methods.put(method.getName(), method);
    }

    public MethodSymbol getMethod(String name) {
        return methods.get(name);
    }

    @Override
    public String getSymbolType() {
        return "Service";
    }
}
