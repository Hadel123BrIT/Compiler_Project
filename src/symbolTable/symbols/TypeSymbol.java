package symbolTable.symbols;
import java.util.*;

public class TypeSymbol extends Symbol {
    private boolean isPrimitive;
    private boolean isArray;
    private TypeSymbol arrayType;

    public TypeSymbol(String name, boolean isPrimitive, int line, int column) {
        super(name, line, column);
        this.isPrimitive = isPrimitive;
        this.isArray = false;
    }

    public boolean isPrimitive() {
        return isPrimitive;
    }

    public boolean isArray() {
        return isArray;
    }

    public TypeSymbol getArrayType() {
        return arrayType;
    }

    public void setArrayType(TypeSymbol type) {
        this.isArray = true;
        this.arrayType = type;
    }

    public boolean isAssignableFrom(TypeSymbol other) {
        // Simplified type compatibility check
        if (this.isArray && other.isArray) {
            return this.arrayType.isAssignableFrom(other.arrayType);
        }
        return this.getName().equals(other.getName());
    }

    @Override
    public String getSymbolType() {
        return "Type";
    }
}
