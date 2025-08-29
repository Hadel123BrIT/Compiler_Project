package AST;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDeclaration {
    String Interface;
    String lbrace;
    String rbrace;
    String identifier;
    List<InterfaceBody> interfaceBodies=new ArrayList<InterfaceBody>();

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String anInterface) {
        Interface = anInterface;
    }

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

    public List<InterfaceBody> getInterfaceBodies() {
        return interfaceBodies;
    }

    public void setInterfaceBodies(List<InterfaceBody> interfaceBodies) {
        this.interfaceBodies = interfaceBodies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InterfaceDeclaration{");

        if (Interface != null) {
            sb.append("Interface='").append(Interface).append('\'').append(", ");
        }
        if (lbrace != null) {
            sb.append("lbrace='").append(lbrace).append('\'').append(", ");
        }
        if (rbrace != null) {
            sb.append("rbrace='").append(rbrace).append('\'').append(", ");
        }
        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\'').append(", ");
        }
        if (interfaceBodies != null && !interfaceBodies.isEmpty()) {
            sb.append("interfaceBodies=").append(interfaceBodies);
        }

        sb.append("}");
        return sb.toString();
    }

}
