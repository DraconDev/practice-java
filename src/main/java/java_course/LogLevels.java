package java_course;

public class LogLevels {

    public static String message(String logLine) {
        return logLine.split("\\s", 2)[1].trim();
    }

    public static String logLevel(String logLine) {
        String logMessage = logLine.split("\\s", 2)[0].trim();
        return logMessage.toLowerCase().substring(1, logMessage.length() - 2);
    }

    public static String reformat(String logLine) {
        String logMessage = logLine.split("\\s", 2)[0].trim();
        logMessage = logMessage.toLowerCase().substring(1, logMessage.length() - 2).trim();
        String result = String.format("%s (%s)", logLine.split("\\s", 2)[1].trim(), logMessage);
        return result;
    }
}
