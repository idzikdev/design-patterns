package units;

public abstract class Unit {
    private String name;
    private int hp;
    private int exp;
    private int damagePoints;

    protected Unit(String name, int hp, int exp, int damagePoints) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.damagePoints = damagePoints;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", exp=" + exp +
                ", damagePoints=" + damagePoints +
                '}';
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