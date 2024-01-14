package java_course;

public class MicroBlog {
    public String truncate(String input) {
        // * return up to 5 characters of input string
        String truncatedString = input.substring(0, Math.min(input.length(), 5));
        return truncatedString;
    }
}
