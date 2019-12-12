package units;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {


    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        FirstArmyFactory firstArmyFactory = new FirstArmyFactory();
        List<InfantryUnit> infantryUnitsPolish = Tools.getInfantryUnits(firstArmyFactory, 20, UnitType.RIFLEMAN);
        List<ArmoredUnit> armoredUnitsPolish = Tools.getArmouredUnits(firstArmyFactory, 10, UnitType.TANK);
        armoredUnitsPolish.addAll(Tools.getArmouredUnits(firstArmyFactory, 2, UnitType.MODERN_ARMOR));
        List<AirUnit> airUnitsPolish = Tools.getAirUnits(firstArmyFactory, 12, UnitType.BOMBER);
        List<NavalUnit> navalUnitsPolish = new ArrayList<>();
        List<ArtilleryUnit> artilleryUnitsPolish = Tools.getArtilleryUnits(firstArmyFactory, 20, UnitType.ARTILLERY);
        airUnitsPolish.addAll(Tools.getAirUnits(firstArmyFactory, 1, UnitType.STEALTH_BOMBER));
        logger.info("-----------------------");
        logger.info("First army has");
        logger.info("-----------------------");
        logger.info(infantryUnitsPolish.size() + " infantry units");
        logger.info(armoredUnitsPolish.size() + " armored units");
        logger.info(artilleryUnitsPolish.size() + " artillery units");
        logger.info(navalUnitsPolish.size() + " naval units");
        logger.info(airUnitsPolish.size() + " air units");
        logger.info("-----------------------");
        logger.info("Now it is your turn. You can create second army units in the same way");
    }
}