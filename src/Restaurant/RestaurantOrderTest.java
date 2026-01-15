package Restaurant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantOrderTest {

    @Test
    void calculateTotalPrice() {
        String order = "Soup_bouyabese:20, Soup_bouyabese:20, Machete_steak:100, Coffee_espresso:10, Croisan:12";
        assertEquals(162, RestaurantOrder.calculateTotalPrice(order), 0.001);
        order = "Soup_bouyabese:20, Soup_bouyabese:20";
        assertEquals(40, RestaurantOrder.calculateTotalPrice(order), 0.001);
        order = "Croisan:12";
        assertEquals(12, RestaurantOrder.calculateTotalPrice(order), 0.001);
        order = "Croisan_chocolate:12.5";
        assertEquals(12.5, RestaurantOrder.calculateTotalPrice(order), 0.001);
        order = "Salt:0.1, Pepper:0.2";
        assertEquals(0.3, RestaurantOrder.calculateTotalPrice(order), 0.001);
        order = "Croisan_2023:12, Machete_steak_150g:50";
        assertEquals(62, RestaurantOrder.calculateTotalPrice(order), 0.001);
    }
}