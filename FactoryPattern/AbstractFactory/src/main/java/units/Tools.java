package units;

import java.util.ArrayList;
import java.util.List;

public class Tools {
    public static List<InfantryUnit> getInfantryUnits(Factory factory, int number, UnitType unitType) {
        List<InfantryUnit> resultList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            resultList.add(factory.createInfantryUnit(unitType));
        }
        return resultList;
    }

    public static List<ArmoredUnit> getArmouredUnits(Factory factory, int number, UnitType unitType) {
        List<ArmoredUnit> resultList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            resultList.add(factory.createArmoredUnit(unitType));
        }
        return resultList;
    }

    public static List<ArtilleryUnit> getArtilleryUnits(Factory factory, int number, UnitType unitType) {
        List<ArtilleryUnit> resultList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            resultList.add(factory.createArtilleryUnit(unitType));
        }
        return resultList;
    }

    public static List<NavalUnit> getNavalUnits(Factory factory, int number, UnitType unitType) {
        List<NavalUnit> resultList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            resultList.add(factory.createNavalUnit(unitType));
        }
        return resultList;
    }

    public static List<AirUnit> getAirUnits(Factory factory, int number, UnitType unitType) {
        List<AirUnit> resultList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            resultList.add(factory.createAirUnit(unitType));
        }
        return resultList;
    }
}