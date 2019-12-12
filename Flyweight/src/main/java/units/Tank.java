package units;

public class Tank {
    private UnitStats stats;
    private int x;
    private int y;
    private int hpLeft;

    public Tank(int x, int y) {
        stats = UnitStatRepository.getUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}