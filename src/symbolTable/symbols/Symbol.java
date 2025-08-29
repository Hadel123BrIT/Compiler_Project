package symbolTable.symbols;

public abstract class Symbol {
    private String name;
    private int declarationLine;
    private int declarationColumn;

    public Symbol(String name, int line, int column) {
        this.name = name;
        this.declarationLine = line;
        this.declarationColumn = column;
    }

    public String getName() { return name; }
    public int getLine() { return declarationLine; }
    public int getColumn() { return declarationColumn; }

    public abstract String getSymbolType();
}



