package units;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static units.UnitType.RIFLEMAN;
import static units.UnitType.TANK;

public class Main {
    private Logger logger = LogManager.getLogger(getClass());

    public static void main(String[] args) {
        Factory factory = new UnitFactory();
        Unit tank = factory.createUnit(TANK);
        Unit rifleman = factory.createUnit(RIFLEMAN);
        Main main = new Main();
        if (tank instanceof Tank) {
            main.logger.info(tank);
        }
        if (rifleman instanceof Rifleman) {
            main.logger.info(rifleman);
        }
    }
}