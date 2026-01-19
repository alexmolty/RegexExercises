package isNumber;

public class StringExpressions {
    public static boolean isNumber(String input) {
        if(input == null || input.isEmpty()) return false;
        String regex = "-?(0|[1-9]\\d*)(\\.\\d+)?";
        return input.matches(regex);
    }
}
