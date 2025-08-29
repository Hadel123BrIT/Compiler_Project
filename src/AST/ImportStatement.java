package AST;

public class ImportStatement extends Statement{
    String Import;
    String from;
    String semi;
    String stringLiteral;
    ImportClause importClause;

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSemi() {
        return semi;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public ImportClause getImportClause() {
        return importClause;
    }

    public void setImportClause(ImportClause importClause) {
        this.importClause = importClause;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImportStatement{\n");

        if (Import != null) {
            sb.append("Import='").append(Import).append('\'').append("\n");
        }
        if (from != null) {
            sb.append("from='").append(from).append('\'').append("\n");
        }
        if (semi != null) {
            sb.append("semi='").append(semi).append('\'').append("\n");
        }
        if (stringLiteral != null) {
            sb.append("stringLiteral='").append(stringLiteral).append("\n");
        }
        if (importClause != null) {
            sb.append("importClause=").append(importClause).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
