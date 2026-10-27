package Decorator;

public class CheeseDecorator implements Food {
    private Food decoratedFood;

    public CheeseDecorator(Food food) {
        this.decoratedFood = food;
    }

    public String getDescription() {
        return decoratedFood.getDescription() + ", with Cheese";
    }

    public double getCost() {
        return decoratedFood.getCost() + 1.00;
    }
}
