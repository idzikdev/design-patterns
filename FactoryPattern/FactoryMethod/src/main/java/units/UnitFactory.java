package units;

import static units.Conf.TANK_HP;
import static units.Conf.TANK_EXP;
import static units.Conf.TANK_DAMAGE;
import static units.Conf.RIFLEMAN_HP;
import static units.Conf.RIFLEMAN_EXP;
import static units.Conf.RIFLEMAN_DAMAGE;


public class UnitFactory implements Factory {
    @Override
    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(TANK_HP.getValue(), TANK_EXP.getValue(), TANK_DAMAGE.getValue());
            case RIFLEMAN:
                return new Rifleman(RIFLEMAN_HP.getValue(), RIFLEMAN_EXP.getValue(), RIFLEMAN_DAMAGE.getValue());
            default:
                throw new UnsupportedOperationException("No such unit type");
        }
    }
}