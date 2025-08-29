package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportClause {
    String lbrace;
    String rbrace;
    String identifier;
    ImportSpecifier importSpecifier;
List<CommaImportSpecifier> commaImportSpecifiers=new ArrayList<CommaImportSpecifier>();

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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ImportSpecifier getImportSpecifier() {
        return importSpecifier;
    }

    public void setImportSpecifier(ImportSpecifier importSpecifier) {
        this.importSpecifier = importSpecifier;
    }

    public List<CommaImportSpecifier> getCommaImportSpecifiers() {
        return commaImportSpecifiers;
    }

    public void setCommaImportSpecifiers(List<CommaImportSpecifier> commaImportSpecifiers) {
        this.commaImportSpecifiers = commaImportSpecifiers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImportClause{");

        if (lbrace != null) {
            sb.append("lbrace='").append(lbrace).append('\'').append(", ");
        }
        if (rbrace != null) {
            sb.append("rbrace='").append(rbrace).append('\'').append(", ");
        }
        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\'').append(", ");
        }
        if (importSpecifier != null) {
            sb.append("importSpecifier=").append(importSpecifier).append(", ");
        }
        if (!commaImportSpecifiers.isEmpty()) {
            sb.append("commaImportSpecifiers=").append(commaImportSpecifiers);
        }

        sb.append("}");
        return sb.toString();
    }

}
