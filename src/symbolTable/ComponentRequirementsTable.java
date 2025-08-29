package symbolTable;

import symbolTable.symbols.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ComponentRequirementsTable {
    private Map<String, Set<InputSymbol>> requiredInputs = new HashMap<>();

    public void checkRequiredInputs(String component, Set<String> providedInputs, int line) {
        for (InputSymbol input : requiredInputs.getOrDefault(component, new HashSet<>())) {
            if (input.isRequired() && !providedInputs.contains(input.getName())) {
                throw new SemanticError(
                        "Missing required input '" + input.getName() +
                                "' for component '" + component + "'", line);
            }
        }
    }

    public Map<String, Set<InputSymbol>> getRequiredInputs() {
        return requiredInputs;
    }
}