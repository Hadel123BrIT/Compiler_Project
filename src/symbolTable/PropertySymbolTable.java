package symbolTable;
import symbolTable.symbols.*;
import java.util.*;

public class PropertySymbolTable {
    private Map<String, Map<String, PropertySymbol>> componentProperties = new HashMap<>();


    public void checkPropertyExists(String component, String property, int line) {
        if (!componentProperties.containsKey(component) ||
                !componentProperties.get(component).containsKey(property)) {
            throw new SemanticError(
                    "Undefined property '" + property +
                            "' for component '" + component + "'", line);
        }
    }

    public Map<String, Map<String, PropertySymbol>> getComponentProperties() {
        return componentProperties;
    }
}