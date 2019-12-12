package base;

public class Tank implements Activity {
    private String name;
    private int armour;
    private String weapon;
    private int damage;

    public Tank(String name, int armour, String weapon, int damage) {
        this.name = name;
        this.armour = armour;
        this.weapon = weapon;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmour() {
        return armour;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}