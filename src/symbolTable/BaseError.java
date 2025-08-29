package symbolTable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class BaseError extends RuntimeException {
    private final String errorCode;
    private final int line;
    private final int column;
    private static final String LOG_FILE_PATH = System.getProperty("user.home") + "/Documents/compiler_errors.log";

    protected BaseError(String errorCode, String message, int line, int column) {
        super(formatMessage(errorCode, message, line, column));
        this.errorCode = errorCode;
        this.line = line;
        this.column = column;
        logErrorToFile();
    }

    private static String formatMessage(String errorCode, String message,
                                        int line, int column) {
        StringBuilder sb = new StringBuilder();

        if (errorCode != null) {
            sb.append("[").append(errorCode).append("] ");
        }

        sb.append(message);

        if (line > 0) {
            sb.append(" at line ").append(line);
            if (column > 0) {
                sb.append(":").append(column);
            }
        }

        return sb.toString();
    }

    private void logErrorToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
            writer.write(getLogEntry());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Failed to write error to log file: " + e.getMessage());
        }
    }

    protected String getLogEntry() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        return String.format("[%s] %s - %s (Line: %d, Column: %d)%n",
                dtf.format(now),
                errorCode,
                getMessage(),
                line,
                column);
    }

    // Getters
    public String getErrorCode() { return errorCode; }
    public int getLine() { return line; }
    public int getColumn() { return column; }
}


