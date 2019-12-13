package pizza;

import java.util.List;

public class PizzaData {
    private int cost;
    private List<Topping> toppings;

    public PizzaData(int cost, List<Topping> toppings) {
        this.cost = cost;
        this.toppings = toppings;
    }

    public int getCost() {
        return cost;
    }

    public List<Topping> getToppings() {
        return toppings;
    }
}