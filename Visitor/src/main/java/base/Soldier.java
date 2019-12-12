package base;

public class Soldier implements Activity {
    private String name;
    private int health;
    private String weapon;

    public Soldier(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}