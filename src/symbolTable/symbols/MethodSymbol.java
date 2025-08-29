package symbolTable.symbols;
import java.util.*;

public class MethodSymbol extends Symbol {
    private TypeSymbol returnType;
    private List<ParameterSymbol> parameters = new ArrayList<>();

    public MethodSymbol(String name, TypeSymbol returnType, int line, int column) {
        super(name, line, column);
        this.returnType = returnType;
    }

    public TypeSymbol getReturnType() {
        return returnType;
    }

    public List<ParameterSymbol> getParameters() {
        return parameters;
    }

    public void addParameter(ParameterSymbol param) {
        parameters.add(param);
    }

    @Override
    public String getSymbolType() {
        return "Method";
    }
}
