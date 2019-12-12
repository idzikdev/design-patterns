package order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextMessage implements Observer {
    Logger logger = LogManager.getLogger();
    public void update(Order order) {
        logger.info("STATUS CHANGED - Order number " + order.getId() + " has just changed status to " + order.getStatus());
    }
}