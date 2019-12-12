package pizza;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private Logger logger = LogManager.getLogger(getClass());

    public static void main(String[] args) {
        Main main = new Main();
        Pizza myPizza = new OlivesDecorator(new HamDecorator(new MushroomsDecorator(new Margherita("margeritta", 15))));
        main.logger.info("Your order is " + myPizza.getCost());
    }
}