package pizza;

public class HamDecorator extends PizzaDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 3;
    }
}