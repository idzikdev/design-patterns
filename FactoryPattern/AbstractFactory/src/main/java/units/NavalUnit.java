package units;

public class NavalUnit {
    private int hp;
    private int exp;
    private int damagePoints;

    protected NavalUnit(int hp, int exp, int damagePoints) {
        this.hp = hp;
        this.exp = exp;
        this.damagePoints = damagePoints;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDamagePoints() {
        return damagePoints;
    }
}