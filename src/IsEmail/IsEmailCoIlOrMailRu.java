package IsEmail;
public class IsEmailCoIlOrMailRu {
    public static boolean isEmailCoIlMailRu(String input) {
        if(input == null || input.isEmpty()) return false;
        String regex = "[^, ]+@([A-Za-z0-9]+\\.)*(co\\.il|mail\\.ru)";
        return input.matches(regex);
    }
}
