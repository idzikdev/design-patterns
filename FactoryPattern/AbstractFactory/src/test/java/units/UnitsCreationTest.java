package units;


import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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

/**
 * factory tank unit test
 * checks if units are created with valid parameters
 */
public class UnitsCreationTest extends BaseTest {
    private FirstArmyFactory factory = new FirstArmyFactory();

    /**
     * checking if artillery is created with valid stats
     */
    @Test
    public void checked_artillery_stats_test() {
        ArtilleryUnit unit = factory.createArtilleryUnit(UnitType.ARTILLERY);
        assertThat(ARTILLERY_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(ARTILLERY_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(ARTILLERY_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
    }

    /**
     * checking if battleship is created with valid stats
     */
    @Test
    public void checked_battleship_stats_test() {
        NavalUnit unit = factory.createNavalUnit(UnitType.BATTLESHIP);
        assertThat(BATTLESHIP_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(BATTLESHIP_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(BATTLESHIP_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
    }

    /**
     * checking if bomber is created with valid stats
     */
    @Test
    public void checked_bomber_stats_test() {
        AirUnit unit = factory.createAirUnit(UnitType.BOMBER);
        assertThat(BOMBER_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(BOMBER_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(BOMBER_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
    }

    /**
     * checking if destroyer is created with valid stats
     */
    @Test
    public void checked_destroyer_stats_test() {
        NavalUnit unit = factory.createNavalUnit(UnitType.DESTROYER);
        assertThat(DESTROYER_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(DESTROYER_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(DESTROYER_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
    }

    /**
     * checking if modern armor is created with valid stats
     */
    @Test
    public void checked_modern_armor_stats_test() {
        ArmoredUnit unit = factory.createArmoredUnit(UnitType.MODERN_ARMOR);
        assertThat(MODERN_ARMOR_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(MODERN_ARMOR_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(MODERN_ARMOR_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
    }

    /**
     * checking if rifleman is created with valid stats
     */
    @Test
    public void checked_rifleman_stats_test() {
        InfantryUnit unit = factory.createInfantryUnit(UnitType.RIFLEMAN);
        assertThat(RIFLEMAN_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(RIFLEMAN_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(RIFLEMAN_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
    }

    /**
     * checking if rocket artillery is created with valid stats
     */
    @Test
    public void checked_rocket_artillery_stats_test() {
        ArtilleryUnit unit = factory.createArtilleryUnit(UnitType.ROCKET_ARTILLERY);
        assertThat(ROCKET_ARTILLERY_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(ROCKET_ARTILLERY_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(ROCKET_ARTILLERY_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
    }

    /**
     * checking if stealth bomber is created with valid stats
     */
    @Test
    public void checked_stealth_bomber_stats_test() {
        AirUnit unit = factory.createAirUnit(UnitType.STEALTH_BOMBER);
        assertThat(STEALTH_BOMBER_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(STEALTH_BOMBER_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(STEALTH_BOMBER_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
        ;
    }

    /**
     * checking if tank is created with valid stats
     */
    @Test
    public void checked_tank_stats_test() {
        ArmoredUnit unit = factory.createArmoredUnit(UnitType.TANK);
        assertThat(TANK_HP.getValue())
                .as("hp")
                .isEqualTo(unit.getHp());
        assertThat(TANK_EXP.getValue())
                .as("exp")
                .isEqualTo(unit.getExp());
        assertThat(TANK_DAMAGE.getValue())
                .as("damage")
                .isEqualTo(unit.getDamagePoints());
    }
}