package Restaurant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RestaurantOrder {
    public static double calculateTotalPrice(String order) {
        if(order == null || order.isEmpty()) return 0;
        String regex = "(?<=\\w:)\\d+(\\.\\d+)?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(order);
        double sum = 0;
        while (m.find()) {
            sum += Double.parseDouble(m.group());
        }
        return sum;
    }
}
