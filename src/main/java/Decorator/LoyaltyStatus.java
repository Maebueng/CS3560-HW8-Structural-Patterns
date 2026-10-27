package Decorator;

public class LoyaltyStatus {
    private String statusLevel;

    public LoyaltyStatus(String statusLevel) {
        this.statusLevel = statusLevel;
    }

    public double applyDiscountBasedOnStatusLevel(double totalCost) {
        if (statusLevel.equalsIgnoreCase("Gold")) {
            return totalCost * 0.70; // 30% discount
        } else if (statusLevel.equalsIgnoreCase("Silver")) {
            return totalCost * 0.85; // 15% discount
        } else {
            return totalCost;
        }
    }
}
