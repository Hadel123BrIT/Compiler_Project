package AST;

import java.util.ArrayList;
import java.util.List;

public class Block {
    String lbrace = "{";                    // '{'
    String rbrace = "}";                    // '}'
    List<Statement> statements = new ArrayList<>();

    public String getLbrace() {
        return lbrace;
    }

    public void setLbrace(String lbrace) {
        this.lbrace = lbrace;
    }

    public String getRbrace() {
        return rbrace;
    }

    public void setRbrace(String rbrace) {
        this.rbrace = rbrace;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Block{");

        if (lbrace != null) {
            sb.append("lbrace='").append(lbrace).append('\'');
        }

        if (rbrace != null) {
            sb.append("rbrace='").append(rbrace).append('\'');
        }

        if (statements != null && !statements.isEmpty()) {
            sb.append("statements=").append(statements);
        } else {
            if (sb.length() > 8) sb.append(", ");
            sb.append("statements=[]");
        }

        sb.append("}");
        return sb.toString();
    }
    public String CodeGenerate(){
        StringBuilder st = new StringBuilder();

        for (Statement item : this.statements){

            st.append(item.CodeGenerate());
        }
        return st.toString();
    }
}