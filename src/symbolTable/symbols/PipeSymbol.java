package symbolTable.symbols;
import java.util.*;

public class PipeSymbol extends Symbol {
    private String transformMethod;
    private int minArgs;
    private int maxArgs;

    public PipeSymbol(String name, String transformMethod, int minArgs, int maxArgs, int line, int column) {
        super(name, line, column);
        this.transformMethod = transformMethod;
        this.minArgs = minArgs;
        this.maxArgs = maxArgs;
    }

    public String getTransformMethod() {
        return transformMethod;
    }

    public int getMinArgs() {
        return minArgs;
    }

    public int getMaxArgs() {
        return maxArgs;
    }

    @Override
    public String getSymbolType() {
        return "Pipe";
    }
}
