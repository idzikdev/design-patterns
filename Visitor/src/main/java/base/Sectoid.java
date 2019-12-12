package base;

public class Sectoid implements Activity {
    private String rank;
    private int health;
    private int armor;
    private String weapon;

    public Sectoid(String rank, int health, int armor, String weapon) {
        this.rank = rank;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }

    public int getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public String getRank() {
        return rank;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}