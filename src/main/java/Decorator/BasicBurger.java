package Decorator;

public class BasicBurger implements Food{
    public String getDescription() {
        return ""; //"A basic hamburger with a beef patty";
    }

    public double getCost() {
        return 0.00;
    }
}
