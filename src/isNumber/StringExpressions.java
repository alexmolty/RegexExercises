package isNumber;

public class StringExpressions {
    public static boolean isNumber(String input) {
        if(input == null || input.isEmpty()) return false;
        String regex = "(-?0(\\.\\d+)?)|(-?[1-9]+(\\.\\d+)?)";
        return input.matches(regex);
    }
}
