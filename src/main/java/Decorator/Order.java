package Decorator;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> items = new ArrayList<>();

    public void addItem(Food food) {
        items.add(food);
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (Food item: items) {
            total += item.getCost();
        }
        return total;
    }

    public List<Food> getItems() {
        return items;
    }
}
