package units;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * factory tank unit test
 * checks if tank is created with valid parameters
 * parametrized test, look at @TestTankData class
 */
public class UnitsCreationTest extends BaseTest {
    /**
     * factory for units
     */
    private UnitFactory factory=new UnitFactory();

    /**
     * checking if rifleman is created with valid stats
     */
    @Test
    public void check_rifleman_stats() {
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);
        assertEquals(Conf.RIFLEMAN_HP.getValue(),rifleman.getHp());
        assertEquals(Conf.RIFLEMAN_EXP.getValue(),rifleman.getExp());
        assertEquals(Conf.RIFLEMAN_DAMAGE.getValue(),rifleman.getDamagePoints());
    }

    /**
     * checking if tank is created with valid stats
     */
    @Test
    public void check_tank_stats() {
        Unit tank = factory.createUnit(UnitType.TANK);
        assertEquals(Conf.TANK_HP.getValue(),tank.getHp());
        assertEquals(Conf.TANK_EXP.getValue(),tank.getExp());
        assertEquals(Conf.TANK_DAMAGE.getValue(),tank.getDamagePoints());
    }
}