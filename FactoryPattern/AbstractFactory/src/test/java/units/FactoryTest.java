package units;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * testing the instance of units
 */
public class FactoryTest extends BaseTest {
    private FirstArmyFactory factory = new FirstArmyFactory();

    /**
     * test if unit is a artillery
     */
    @Test
    public void created_artillery_unit_test() {
        assertThat(factory.createArtilleryUnit(UnitType.ARTILLERY))
                .as("checking artillery")
                .isInstanceOf(Artillery.class);
    }

    /**
     * test if unit is a battleship
     */
    @Test
    public void created_battleship_unit_test() {
        assertThat(factory.createNavalUnit(UnitType.BATTLESHIP))
                .as("checking battleship")
                .isInstanceOf(Battleship.class);
    }

    /**
     * test if unit is a bomber
     */
    @Test
    public void created_bomber_unit_test() {
        assertThat(factory.createAirUnit(UnitType.BOMBER))
                .as("checking bomber")
                .isInstanceOf(Bomber.class);
    }

    /**
     * test if unit is a destroyer
     */
    @Test
    public void created_destroyer_unit_test() {
        assertThat(factory.createNavalUnit(UnitType.DESTROYER))
                .as("checking destroyer")
                .isInstanceOf(Destroyer.class);
    }

    /**
     * test if unit is a modern armor
     */
    @Test
    public void created_modern_armor_unit_test() {
        assertThat(factory.createArmoredUnit(UnitType.MODERN_ARMOR))
                .as("checking modern armor")
                .isInstanceOf(ModernArmor.class);
    }

    /**
     * test if unit is a rifleman
     */
    @Test
    public void created_infantry_unit_test() {
        assertThat(factory.createInfantryUnit(UnitType.RIFLEMAN))
                .as("checking infantry")
                .isInstanceOf(Rifleman.class);
    }

    /**
     * test if unit is a rocker artillery
     */
    @Test
    public void created_rocket_artillery_unit_test() {
        assertThat(factory.createArtilleryUnit(UnitType.ROCKET_ARTILLERY))
                .as("checking rocket artillery")
                .isInstanceOf(RocketArtillery.class);
    }

    /**
     * test if unit is a stealth bomber
     */
    @Test
    public void created_stealth_bomber_unit_test() {
        assertThat(factory.createAirUnit(UnitType.STEALTH_BOMBER))
                .as("checking stealth bomber")
                .isInstanceOf(StealthBomber.class);
    }

    /**
     * test if unit is a tank
     */
    @Test
    public void created_tank_unit_test() {
        assertThat(factory.createArmoredUnit(UnitType.TANK))
                .as("checking tank")
                .isInstanceOf(Tank.class);
    }
}