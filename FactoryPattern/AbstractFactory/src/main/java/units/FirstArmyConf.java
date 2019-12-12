package units;

public enum FirstArmyConf {
    ARTILLERY_HP(20),
    ARTILLERY_EXP(50),
    ARTILLERY_DAMAGE(10),
    BATTLESHIP_HP(70),
    BATTLESHIP_EXP(0),
    BATTLESHIP_DAMAGE(45),
    BOMBER_HP(30),
    BOMBER_EXP(3),
    BOMBER_DAMAGE(15),
    DESTROYER_HP(50),
    DESTROYER_EXP(1),
    DESTROYER_DAMAGE(30),
    MODERN_ARMOR_HP(25),
    MODERN_ARMOR_EXP(2),
    MODERN_ARMOR_DAMAGE(8),
    RIFLEMAN_HP(20),
    RIFLEMAN_EXP(1),
    RIFLEMAN_DAMAGE(6),
    ROCKET_ARTILLERY_HP(30),
    ROCKET_ARTILLERY_EXP(1),
    ROCKET_ARTILLERY_DAMAGE(15),
    STEALTH_BOMBER_HP(70),
    STEALTH_BOMBER_EXP(0),
    STEALTH_BOMBER_DAMAGE(40),
    TANK_HP(20),
    TANK_EXP(2),
    TANK_DAMAGE(6);

    private int value;

    FirstArmyConf(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}