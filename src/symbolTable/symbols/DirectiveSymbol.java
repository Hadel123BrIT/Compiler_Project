package symbolTable.symbols;
import java.util.*;

public class DirectiveSymbol extends Symbol {
    private String selector;
    private List<InputSymbol> inputs = new ArrayList<>();
    private List<OutputSymbol> outputs = new ArrayList<>();

    public DirectiveSymbol(String name, String selector, int line, int column) {
        super(name, line, column);
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    public List<InputSymbol> getInputs() {
        return inputs;
    }

    public List<OutputSymbol> getOutputs() {
        return outputs;
    }

    public void addInput(InputSymbol input) {
        inputs.add(input);
    }

    public void addOutput(OutputSymbol output) {
        outputs.add(output);
    }

    @Override
    public String getSymbolType() {
        return "Directive";
    }
}
