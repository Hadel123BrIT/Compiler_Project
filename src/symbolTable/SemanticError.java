package symbolTable;

public class SemanticError extends BaseError {
    public SemanticError(String message, int line) {
        this("ANGULAR_SEMANTIC", message, line, -1);
    }

    public SemanticError(String errorCode, String message, int line, int column) {
        super(errorCode, message, line, column);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String errorCode = "ANGULAR_SEMANTIC";
        private String message;
        private int line = -1;
        private int column = -1;

        public Builder withErrorCode(String code) {
            this.errorCode = code;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder atLocation(int line, int column) {
            this.line = line;
            this.column = column;
            return this;
        }

        public Builder atLine(int line) {
            this.line = line;
            return this;
        }

        public SemanticError build() {
            if (message == null) {
                throw new IllegalStateException("Error message must be specified");
            }
            return new SemanticError(errorCode, message, line, column);
        }
    }
}