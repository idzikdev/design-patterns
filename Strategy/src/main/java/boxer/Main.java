package boxer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private Logger logger = LogManager.getLogger(getClass());

    public static void main(String[] args) {
        Main main = new Main();
        Boxer boxer = new Boxer("Rocky");
        boxer.setPunch(new LeftPunch());
        main.logger.info(boxer.punch());
        boxer.setPunch(new RightPunch());
        main.logger.info(boxer.punch());
    }
}