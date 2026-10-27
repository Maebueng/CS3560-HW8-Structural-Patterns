package Decorator;

public class FriesDecorator implements Food {
    private Food decoratedFood;

    public FriesDecorator(Food food) {
        this.decoratedFood = food;
    }

    public String getDescription() {
        return decoratedFood.getDescription() + ", with a side of Fries";
    }

    public double getCost() {
        return decoratedFood.getCost() + 2.50;
    }
}
