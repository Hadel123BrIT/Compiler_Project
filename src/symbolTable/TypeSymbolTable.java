package symbolTable;
import symbolTable.symbols.*;

import java.util.HashMap;
import java.util.Map;

public class TypeSymbolTable {
    public Map<String, TypeSymbol> getTypes() {
        return types;
    }

    private Map<String, TypeSymbol> types = new HashMap<>();

    public void checkTypeCompatibility(TypeSymbol expected, TypeSymbol actual, int line) {
        if (!expected.isAssignableFrom(actual)) {
            throw new SemanticError(
                    "Type mismatch. Expected " + expected.getName() +
                            " but got " + actual.getName(), line);
        }
    }
}