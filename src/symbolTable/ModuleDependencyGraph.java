package symbolTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import symbolTable.symbols.*;

public class ModuleDependencyGraph {
    private Map<String, Set<String>> dependencies = new HashMap<>();
    private Set<String> visited = new HashSet<>();
    private Set<String> recursionStack = new HashSet<>();

    public void checkForCircularDependency(String module) {
        if (recursionStack.contains(module)) {
            throw new SemanticError("Circular dependency detected involving module: " + module, 0);
        }
        if (visited.contains(module)) return;

        visited.add(module);
        recursionStack.add(module);

        for (String dep : dependencies.getOrDefault(module, new HashSet<>())) {
            checkForCircularDependency(dep);
        }

        recursionStack.remove(module);
    }

    public Map<String, Set<String>> getDependencies() {
        return dependencies;
    }

    public Set<String> getVisited() {
        return visited;
    }

    public Set<String> getRecursionStack() {
        return recursionStack;
    }
}