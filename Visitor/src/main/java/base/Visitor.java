package base;

public interface Visitor {
    int visit(Sectoid sectoid);

    int visit(Soldier soldier);

    int visit(Tank tank);
}