package AST;

public class InterfaceBody {
    String identifier;
    String colon;
    String semi;
    Type type;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getSemi() {
        return semi;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InterfaceBody{");

        if (identifier != null) {
            sb.append("identifier='").append(identifier).append('\'').append(", ");
        }
        if (colon != null) {
            sb.append("colon='").append(colon).append('\'').append(", ");
        }
        if (semi != null) {
            sb.append("semi='").append(semi).append('\'').append(", ");
        }
        if (type != null) {
            sb.append("type=").append(type);
        }

        sb.append("}");
        return sb.toString();
    }

}
