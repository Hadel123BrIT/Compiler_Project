package AST;

public class CommaImportSpecifier extends ASTNode{
    String comma;
ImportSpecifier importSpecifier;

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ImportSpecifier getImportSpecifier() {
        return importSpecifier;
    }

    public void setImportSpecifier(ImportSpecifier importSpecifier) {
        this.importSpecifier = importSpecifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommaImportSpecifier{");

        if (comma != null) {
            sb.append("comma='").append(comma).append('\'').append(", ");
        }
        if (importSpecifier != null) {
            sb.append("importSpecifier=").append(importSpecifier);
        }

        sb.append("}");
        return sb.toString();
    }

}
