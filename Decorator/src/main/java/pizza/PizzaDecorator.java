package pizza;

import org.apache.commons.lang3.StringUtils;

public abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        super(StringUtils.EMPTY, 0);
        this.pizza = pizza;
    }
}