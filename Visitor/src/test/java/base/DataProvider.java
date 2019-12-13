package base;

import java.util.List;

public class DataProvider {
    private Soldier soldier;
    private Sectoid sectoid;
    private Tank tank;
    private List<Integer> expectedList;

    public DataProvider(Soldier soldier, Sectoid sectoid, Tank tank, List<Integer> expectedList) {
        this.soldier = soldier;
        this.sectoid = sectoid;
        this.tank = tank;
        this.expectedList = expectedList;
    }

    public List<Integer> getExpectedList() {
        return expectedList;
    }

    public Sectoid getSectoid() {
        return sectoid;
    }

    public Soldier getSoldier() {
        return soldier;
    }

    public Tank getTank() {
        return tank;
    }
}