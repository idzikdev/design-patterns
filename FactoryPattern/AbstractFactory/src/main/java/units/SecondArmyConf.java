package units;

public enum SecondArmyConf {
    ARTILLERY_HP(25),
    ARTILLERY_EXP(2),
    ARTILLERY_DAMAGE(12),
    BATTLESHIP_HP(50),
    BATTLESHIP_EXP(2),
    BATTLESHIP_DAMAGE(42),
    BOMBER_HP(32),
    BOMBER_EXP(1),
    BOMBER_DAMAGE(12),
    DESTROYER_HP(40),
    DESTROYER_EXP(2),
    DESTROYER_DAMAGE(20),
    MODERN_ARMOR_HP(28),
    MODERN_ARMOR_EXP(12),
    MODERN_ARMOR_DAMAGE(4),
    RIFLEMAN_HP(22),
    RIFLEMAN_EXP(6),
    RIFLEMAN_DAMAGE(4),
    ROCKET_ARTILLERY_HP(32),
    ROCKET_ARTILLERY_EXP(2),
    ROCKET_ARTILLERY_DAMAGE(20),
    STEALTH_BOMBER_HP(50),
    STEALTH_BOMBER_EXP(10),
    STEALTH_BOMBER_DAMAGE(20),
    TANK_HP(22),
    TANK_EXP(5),
    TANK_DAMAGE(8);

    private int value;

    SecondArmyConf(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}