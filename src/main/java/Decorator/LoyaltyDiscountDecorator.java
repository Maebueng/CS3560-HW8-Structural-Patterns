package Decorator;

public class LoyaltyDiscountDecorator implements Food {
    private Food decoratedFood;

    public LoyaltyDiscountDecorator(Food food) {
        this.decoratedFood = food;
    }

    public String getDescription() {
        return decoratedFood.getDescription() + ", and ordered while being part of our Loyalty Program";
    }

    public double getCost() {
        // 30% discount
        return decoratedFood.getCost() - (0.00 * decoratedFood.getCost());
    }
}
