package symbolTable;
import symbolTable.symbols.*;

import java.util.HashMap;
import java.util.*;

public class TemplateVariableScopeTable {
    public Stack<Map<String, VariableSymbol>> getScopes() {
        return scopes;
    }

    private Stack<Map<String, VariableSymbol>> scopes = new Stack<>();

    public void checkVariableInScope(String name, int line) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) return;
        }
        throw new SemanticError("Template variable '" + name + "' is not defined in this scope", line);
    }

    public void pushScope() {
        scopes.push(new HashMap<>());
    }

    public void popScope() {
        scopes.pop();
    }
}