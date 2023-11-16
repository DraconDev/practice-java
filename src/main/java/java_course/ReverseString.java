package java_course;

public class ReverseString {
    public static String reverse(String inputString) {
        StringBuilder result = new StringBuilder(inputString).reverse();
        return result.toString();
    }

}
