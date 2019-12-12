package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static base.VisitorEnum.SOLDIER_THINK_POWER;
import static base.VisitorEnum.TANK_THINK_POWER;
import static base.VisitorEnum.SECTOID_THINK_POWER;
import static base.VisitorEnum.SECTOID_POWER;
import static base.VisitorEnum.TANK_POWER;
import static base.VisitorEnum.SOLDIER_POWER;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        Soldier soldier = new Soldier("Antoni", 10, "Pistol");
        Tank tank = new Tank("Rudy-102", 10, "Heavy Plasma", 100);
        Sectoid sectoid = new Sectoid("Commander", 100, 50, "Heavy Plasma");
        UnknownVisitor unknownVisitor = new UnknownVisitor("Unknown person");
        logger.info("Somebody might says");
        logger.info(SOLDIER_THINK_POWER.getInfo() + soldier.accept(unknownVisitor));
        logger.info(TANK_THINK_POWER.getInfo() + tank.accept(unknownVisitor));
        logger.info(SECTOID_THINK_POWER.getInfo() + sectoid.accept(unknownVisitor));
        logger.info("---------------------------------------");
        MinisterOfDefenseVisitor ministerOfDefenseVisitor = new MinisterOfDefenseVisitor("Minister of Defense");
        logger.info("Minister of defense says");
        logger.info(SOLDIER_POWER.getInfo() + soldier.accept(ministerOfDefenseVisitor));
        logger.info(TANK_POWER.getInfo() + tank.accept(ministerOfDefenseVisitor));
        logger.info(SECTOID_POWER.getInfo() + sectoid.accept(ministerOfDefenseVisitor));
    }
}