package symbolTable.symbols;

import java.util.*;

public class ComponentSymbol extends Symbol {
    private String selector;
    private String templateUrl;
    private List<InputSymbol> inputs = new ArrayList<>();
    private List<OutputSymbol> outputs = new ArrayList<>();

    public ComponentSymbol(String name, String selector, int line, int column) {
        super(name, line, column);
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    public String getTemplateUrl() {
        return templateUrl;
    }

    public List<InputSymbol> getInputs() {
        return inputs;
    }

    public List<OutputSymbol> getOutputs() {
        return outputs;
    }

    public void setTemplateUrl(String url) {
        this.templateUrl = url;
    }

    public void addInput(InputSymbol input) {
        inputs.add(input);
    }

    public void addOutput(OutputSymbol output) {
        outputs.add(output);
    }

    @Override
    public String getSymbolType() {
        return "Component";
    }
}
