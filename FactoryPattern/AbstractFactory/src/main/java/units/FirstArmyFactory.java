package units;

import static units.FirstArmyConf.ARTILLERY_HP;
import static units.FirstArmyConf.ARTILLERY_EXP;
import static units.FirstArmyConf.ARTILLERY_DAMAGE;
import static units.FirstArmyConf.MODERN_ARMOR_HP;
import static units.FirstArmyConf.MODERN_ARMOR_EXP;
import static units.FirstArmyConf.MODERN_ARMOR_DAMAGE;
import static units.FirstArmyConf.RIFLEMAN_HP;
import static units.FirstArmyConf.RIFLEMAN_EXP;
import static units.FirstArmyConf.RIFLEMAN_DAMAGE;
import static units.FirstArmyConf.TANK_HP;
import static units.FirstArmyConf.TANK_EXP;
import static units.FirstArmyConf.TANK_DAMAGE;
import static units.FirstArmyConf.ROCKET_ARTILLERY_HP;
import static units.FirstArmyConf.ROCKET_ARTILLERY_EXP;
import static units.FirstArmyConf.ROCKET_ARTILLERY_DAMAGE;
import static units.FirstArmyConf.DESTROYER_HP;
import static units.FirstArmyConf.DESTROYER_EXP;
import static units.FirstArmyConf.DESTROYER_DAMAGE;
import static units.FirstArmyConf.BATTLESHIP_HP;
import static units.FirstArmyConf.BATTLESHIP_EXP;
import static units.FirstArmyConf.BATTLESHIP_DAMAGE;
import static units.FirstArmyConf.BOMBER_HP;
import static units.FirstArmyConf.BOMBER_EXP;
import static units.FirstArmyConf.BOMBER_DAMAGE;
import static units.FirstArmyConf.STEALTH_BOMBER_HP;
import static units.FirstArmyConf.STEALTH_BOMBER_EXP;
import static units.FirstArmyConf.STEALTH_BOMBER_DAMAGE;

public class FirstArmyFactory implements Factory {
    private static final String UNKNOWN_UNIT_TYPE = "Unknown unit type";

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        InfantryUnit infantryUnit;
        if (unitType == UnitType.RIFLEMAN) {
            infantryUnit = new Rifleman(RIFLEMAN_HP.getValue(), RIFLEMAN_EXP.getValue(), RIFLEMAN_DAMAGE.getValue());
        } else {
            throw new UnsupportedOperationException(UNKNOWN_UNIT_TYPE);
        }
        return infantryUnit;
    }

    @Override
    public ArmoredUnit createArmoredUnit(UnitType unitType) {
        ArmoredUnit armoredUnit;
        switch (unitType) {
            case TANK:
                armoredUnit = new Tank(TANK_HP.getValue(), TANK_EXP.getValue(), TANK_DAMAGE.getValue());
                break;
            case MODERN_ARMOR:
                armoredUnit = new ModernArmor(MODERN_ARMOR_HP.getValue(), MODERN_ARMOR_EXP.getValue(), MODERN_ARMOR_DAMAGE.getValue());
                break;
            default:
                throw new UnsupportedOperationException(UNKNOWN_UNIT_TYPE);
        }
        return armoredUnit;
    }

    @Override
    public ArtilleryUnit createArtilleryUnit(UnitType unitType) {
        ArtilleryUnit artilleryUnit;
        switch (unitType) {
            case ARTILLERY:
                artilleryUnit = new Artillery(ARTILLERY_HP.getValue(), ARTILLERY_EXP.getValue(), ARTILLERY_DAMAGE.getValue());
                break;
            case ROCKET_ARTILLERY:
                artilleryUnit = new RocketArtillery(ROCKET_ARTILLERY_HP.getValue(), ROCKET_ARTILLERY_EXP.getValue(), ROCKET_ARTILLERY_DAMAGE.getValue());
                break;
            default:
                throw new UnsupportedOperationException(UNKNOWN_UNIT_TYPE);
        }
        return artilleryUnit;
    }

    @Override
    public NavalUnit createNavalUnit(UnitType unitType) {
        NavalUnit navalUnit;
        switch (unitType) {
            case DESTROYER:
                navalUnit = new Destroyer(DESTROYER_HP.getValue(), DESTROYER_EXP.getValue(), DESTROYER_DAMAGE.getValue());
                break;
            case BATTLESHIP:
                navalUnit = new Battleship(BATTLESHIP_HP.getValue(), BATTLESHIP_EXP.getValue(), BATTLESHIP_DAMAGE.getValue());
                break;
            default:
                throw new UnsupportedOperationException(UNKNOWN_UNIT_TYPE);
        }
        return navalUnit;
    }

    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        AirUnit airUnit;
        switch (unitType) {
            case BOMBER:
                airUnit = new Bomber(BOMBER_HP.getValue(), BOMBER_EXP.getValue(), BOMBER_DAMAGE.getValue());
                break;
            case STEALTH_BOMBER:
                airUnit = new StealthBomber(STEALTH_BOMBER_HP.getValue(), STEALTH_BOMBER_EXP.getValue(), STEALTH_BOMBER_DAMAGE.getValue());
                break;
            default:
                throw new UnsupportedOperationException(UNKNOWN_UNIT_TYPE);
        }
        return airUnit;
    }
}