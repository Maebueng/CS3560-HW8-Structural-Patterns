import Bridge.*;
import Decorator.*;

public class Driver {
    public static void main (String[] args) {
        //runPaymentScenarios();
        runRestaurantOrderingScenarios();

    } // end main

    private static void runPaymentScenarios() {
        // Instantiates new notification object with new EmailChannel()
        Payment onlinePaymentEmail = new OnlinePayment(new EmailChannel());
        onlinePaymentEmail.makePayment();

        Payment onlinePaymentSMS = new OnlinePayment(new SmsChannel());
        onlinePaymentSMS.makePayment();

        System.out.println();

        Payment cashPaymentEmail = new CashPayment(new EmailChannel());
        cashPaymentEmail.makePayment();

        Payment cashPaymentSMS = new CashPayment(new SmsChannel());
        cashPaymentSMS.makePayment();

        System.out.println();

        Payment bitcoinPaymentEmail = new BitcoinPayment(new EmailChannel());
        bitcoinPaymentEmail.makePayment();

        Payment bitcoinPaymentSMS = new BitcoinPayment(new SmsChannel());
        bitcoinPaymentSMS.makePayment();
    }

    private static void runRestaurantOrderingScenarios() {
        // Create food items with toppings
        Food basicBurger = new BasicBurger();
        Food cheeseBurger = new CheeseDecorator(new BasicBurger());
        Food comboMeal = new FriesDecorator(cheeseBurger);

        // Customer's orders
        Order customerOrder = new Order();
        customerOrder.addItem(basicBurger);
        customerOrder.addItem(cheeseBurger);
        customerOrder.addItem(comboMeal);

        System.out.println("Customer Order: ");
        for (Food item : customerOrder.getItems()) {
            System.out.println("* " + item.getDescription() + " - $" + String.format("%.2f", item.getCost()));
        }

        double subtotal = customerOrder.calculateTotalCost();
        System.out.println("Subtotal Cost: $" + String.format("%.2f", subtotal));

        // Loyalty discount
        LoyaltyStatus customerStatus = new LoyaltyStatus("Gold");
        double discountedCost = customerStatus.applyDiscountBasedOnStatusLevel(subtotal);

        System.out.println("Loyalty Status: Gold (30% Discount Applied)");
        System.out.println("Final Total Cost: $" + String.format("%.2f", discountedCost));
    }

} // end Driver

