package symbolTable;

import symbolTable.symbols.MethodSymbol;

import java.util.HashMap;
import java.util.Map;

public class FunctionsSymbolTable {
    Map<String, MethodSymbol> Function = new HashMap<>();
    public FunctionsSymbolTable(){}
    public void add(String functionName, MethodSymbol methodSymbol){

        Function.put(functionName , methodSymbol);
    }
    public boolean checkIfExist(String functionName,int line){
        if(Function.keySet().contains(functionName))
            return true;
        throw SemanticError.builder()
                .withMessage("Function " + functionName + " is not declared")
                .atLocation(line, -1)
                .build();
    }

    public boolean checknumofParameters(String functionName, int num, int line){
        if(Function.get(functionName).getParameters().size() == num ){
            return true;
        }
        throw SemanticError.builder()
                .withMessage("Function " + functionName + " has incorrect number of parameters")
                .atLocation(line, -1)
                .build();
    }


}