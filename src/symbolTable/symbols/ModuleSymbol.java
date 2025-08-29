package symbolTable.symbols;
import java.util.*;

public class ModuleSymbol extends Symbol {
    private Set<String> declarations = new HashSet<>();
    private Set<String> imports = new HashSet<>();
    private Set<String> exports = new HashSet<>();
    private Set<String> providers = new HashSet<>();

    public ModuleSymbol(String name, int line, int column) {
        super(name, line, column);
    }

    public void addDeclaration(String component) {
        declarations.add(component);
    }

    public void addImport(String module) {
        imports.add(module);
    }

    public void addExport(String component) {
        exports.add(component);
    }

    public void addProvider(String service) {
        providers.add(service);
    }

    public Set<String> getDeclarations() {
        return declarations;
    }

    public Set<String> getImports() {
        return imports;
    }

    public Set<String> getExports() {
        return exports;
    }

    public Set<String> getProviders() {
        return providers;
    }

    @Override
    public String getSymbolType() {
        return "Module";
    }
}
