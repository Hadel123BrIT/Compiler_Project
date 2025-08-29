package symbolTable;

import java.util.HashMap;
import java.util.Map;

import symbolTable.symbols.*;

public class PipeSymbolTable {
    private Map<String, PipeSymbol> pipes = new HashMap<>();

    public void checkPipe(String name, int argCount, int line) {
        if (!pipes.containsKey(name)) {
            throw new SemanticError("Undefined pipe: " + name, line);
        }
        PipeSymbol pipe = pipes.get(name);
        if (argCount < pipe.getMinArgs() || argCount > pipe.getMaxArgs()) {
            throw new SemanticError(
                    "Invalid number of arguments for pipe '" + name +
                            "'. Expected " + pipe.getMinArgs() + "-" + pipe.getMaxArgs() +
                            " but got " + argCount, line);
        }
    }
}