package base;

import static base.VisitorEnum.SECTOID_VISITED_BY;
import static base.VisitorEnum.SOLDIER_VISITED_BY;
import static base.VisitorEnum.TANK_VISITED_BY;

public class UnknownVisitor extends BaseLogger implements Visitor {
    private String name;

    public UnknownVisitor(String name) {
        this.name = name;
    }

    @Override
    public int visit(Sectoid sectoid) {
        logger.info(SECTOID_VISITED_BY.getInfo() + name);
        if (sectoid.getRank().equals("Rookie")) {
            return 50;
        }
        return 5;
    }

    @Override
    public int visit(Soldier soldier) {
        logger.info(SOLDIER_VISITED_BY.getInfo() + name);
        if (soldier.getName().equals("Antoni")) {
            return 5;
        }
        return 1;
    }

    @Override
    public int visit(Tank tank) {
        logger.info(TANK_VISITED_BY.getInfo() + name);
        if (tank.getName().equals("Rudy-102")) {
            return 20;
        }
        return 10;
    }
}