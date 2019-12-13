package pizza;

import java.util.List;

public class PizzaTools {
    public static int getPizzaCost(Pizza myPizza, int baseCost, List<Topping> toppings) {
        int tempCost = baseCost;
        for (Topping entry : toppings
        ) {
            switch (entry) {
                case BACON: {
                    myPizza = new BaconDecorator(myPizza);
                    break;
                }
                case HAM: {
                    myPizza = new HamDecorator(myPizza);
                    break;
                }
                case MUSHROOMS: {
                    myPizza = new MushroomsDecorator(myPizza);
                    break;
                }
                case OLIVES: {
                    myPizza = new OlivesDecorator(myPizza);
                    break;
                }
            }
        }
        return myPizza.getCost();
    }

    public static int getToppingsCost(List<Topping> toppings) {
        int cost = 0;
        for (Topping entry : toppings
        ) {
            cost += entry.getValue();
        }
        return cost;
    }
}