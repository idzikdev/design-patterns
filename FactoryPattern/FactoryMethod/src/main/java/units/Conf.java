package units;

public enum Conf {
    RIFLEMAN_HP(20), RIFLEMAN_EXP(1), RIFLEMAN_DAMAGE(6),
    TANK_HP(20), TANK_EXP(2), TANK_DAMAGE(6);
    private int points;

    Conf(int points) {
        this.points = points;
    }

    public int getValue() {
        return points;
    }
}
