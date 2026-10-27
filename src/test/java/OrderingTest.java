import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Decorator.*;

public class OrderingTest {
    Food basicOrder = new BasicBurger();
    Food comboOrder = new FriesDecorator(new CheeseDecorator(new BasicBurger()));
    // burger = $5.00;
    // cheese = $1.00'
    // fries = $2.50;
    // total = $8.50

    @Test
    public void testBasicOrder() {
        assertEquals("A basic hamburger with a beef patty", basicOrder.getDescription());
        assertEquals(5.00, basicOrder.getCost(), 0.01);
    }

    @Test
    public void testComboMeal() {
        assertEquals("A basic hamburger with a beef patty, with Cheese, with a side of Fries", comboOrder.getDescription());
        assertEquals(8.50, comboOrder.getCost(), 0.01);
    }

    @Test
    public void testComboMealWithLoyaltyDiscount() {
        Food discountedComboOrder = new LoyaltyDiscountDecorator(comboOrder);
        // original price = $8.50
        // discounted price = $8.50 - 30% of 8.50 (2.55)
        //                  = $8.50 - $2.55 = $5.95


        assertEquals("A basic hamburger with a beef patty, with Cheese, with a side of Fries, " +
                "and ordered while being part of our Loyalty Program", discountedComboOrder.getDescription());
        assertEquals(5.95, comboOrder.getCost(), 0.01);
    }
}
