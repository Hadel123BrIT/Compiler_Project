package AST;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Statement> statements = new ArrayList<>();

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }


    @Override
    public String toString() {
        return "Program{ \n" +
                "statements=" + statements +
                '}';
    }
    public String CodeGen(){
        StringBuilder sb = new StringBuilder();

        sb.append("// Create <div id=\"app\"></div>\n" +
                "const appDiv = document.createElement('div');\n" +
                "appDiv.id = 'app';\n" +
                "\n" +
                "// Optional: Add some initial content or class\n" +
                "appDiv.className = 'container';\n" +
                "appDiv.textContent = 'App content will go here...';\n" +
                "\n" +
                "// Append to <body> or a specific container\n" +
                "document.body.appendChild(appDiv);");
        for (Statement stmnt : statements){
            sb.append(stmnt.CodeGenerate());
        }
        return sb.toString();
    }
}