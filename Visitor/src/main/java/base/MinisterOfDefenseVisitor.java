package base;

import static base.VisitorEnum.SECTOID_VISITED_BY;
import static base.VisitorEnum.SOLDIER_VISITED_BY;
import static base.VisitorEnum.TANK_VISITED_BY;

public class MinisterOfDefenseVisitor extends BaseLogger implements Visitor {
    private String name;

    public MinisterOfDefenseVisitor(String name) {
        this.name = name;
    }

    @Override
    public int visit(Sectoid sectoid) {
        int power = sectoid.getArmor();
        logger.info(SECTOID_VISITED_BY.getInfo() + name);
        if (sectoid.getWeapon().equals("Heavy Plasma")) power += power << 1;
        return power;
    }

    @Override
    public int visit(Soldier soldier) {
        int power = soldier.getHealth();
        logger.info(SOLDIER_VISITED_BY.getInfo() + name);
        if (soldier.getWeapon().equals("Pistol")) power = power + 10;
        return power;
    }

    @Override
    public int visit(Tank tank) {
        int power = tank.getArmour();
        logger.info(TANK_VISITED_BY.getInfo() + name);
        if (tank.getWeapon().equals("Heavy Plasma")) power += power << 3;
        return power;
    }
}