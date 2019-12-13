package pizza;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(Parameterized.class)
public class PizzaTest extends BaseTest {
    private PizzaData pizzaData;

    public PizzaTest(PizzaData pizzaData) {
        this.pizzaData = pizzaData;
    }

    @Parameters
    public static List<PizzaData> data() {
        return Arrays.asList(
                new PizzaData(10, Arrays.asList(Topping.BACON, Topping.HAM)),
                new PizzaData(12, Arrays.asList()),
                new PizzaData(14, Arrays.asList(Topping.MUSHROOMS)),
                new PizzaData(16, Arrays.asList(Topping.OLIVES, Topping.BACON)),
                new PizzaData(18, Arrays.asList())
        );
    }


    @Test
    public void should_buy_pizza_with_bacon_ham_mushrooms_olives() {
        Margherita margherita = new Margherita("margherita", pizzaData.getCost());
        assertThat(PizzaTools.getPizzaCost(margherita, pizzaData.getCost(), pizzaData.getToppings()))
                .as("description of things")
                .isEqualTo(PizzaTools.getToppingsCost(pizzaData.getToppings()) + pizzaData.getCost());
    }
}