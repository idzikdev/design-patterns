package units;

public class Destroyer {
    private UnitStats stats;
    private int x;
    private int y;
    private int hpLeft;

    public Destroyer(int x, int y) {
        stats = UnitStatRepository.getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }

    public UnitStats getStats() {
        return stats;
    }
}