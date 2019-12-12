package units;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * testing the instance of units
 */
public class FactoryTest extends BaseTest {
    private UnitFactory factory = new UnitFactory();

    /**
     * test if unit is a tank
     */
    @Test
    public void create_tank_unit() {
        Unit tank = factory.createUnit(UnitType.TANK);
        assertThat(tank).isInstanceOf(Tank.class);
    }

    /**
     * test if unit is a rifleman
     */
    @Test
    public void create_rifleman_unit() {
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);
        assertThat(rifleman).isInstanceOf(Rifleman.class);
    }
}