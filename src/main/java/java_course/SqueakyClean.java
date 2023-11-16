package java_course;

public class SqueakyClean {

    public static String clean(String identifier) {
        if (identifier == "") {
            return "";
        }
        identifier = removeSpaces(identifier);
        identifier = removeControl(identifier);
        identifier = camelize(identifier);
        identifier = removeNotLetters(identifier);
        identifier = removeGreekLower(identifier);

        return identifier;
    }

    private static String camelize(String identifier) {
        String[] result = identifier.split("[-0-9]");
        if (result.length > 1) {
            for (int i = 1; i < result.length; i++) {
                if (result[i].length() > 0) {
                    result[i] = result[i].substring(0, 1).toUpperCase()
                            + (result[i].length() > 1 ? result[i].substring(1) : "");
                }

            }

        }
        return String.join("", result);
    }

    private static String removeNotLetters(String identifier) {
        return identifier.replaceAll("[0-9\\\\p{So}]", "");
    }

    private static String removeSpaces(String identifier) {
        return identifier.replace(" ", "_");
    }

    private static String removeControl(String identifier) {
        return identifier.replaceAll("\\p{Cntrl}", "CTRL");
    }

    private static String removeGreekLower(String identifier) {
        return identifier.replaceAll("[α-ω]", "");
    }
}
