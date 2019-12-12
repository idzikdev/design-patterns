package units;

public class UnitStatRepository {
    private static UnitStats unitStats = new UnitStats("Tank", 100, 100, 120, 80, 10);
    private static UnitStats riflemanStats = new UnitStats("Rifleman", 80, 60, 60, 10, 1);
    private static UnitStats destroyerStats = new UnitStats("Destroyer", 120, 140, 220, 100, 20);

    private UnitStatRepository() {
    }

    public static UnitStats getUnitStats() {
        return unitStats;
    }

    public static UnitStats getRiflemanStats() {
        return riflemanStats;
    }

    public static UnitStats getDestroyerStats() {
        return destroyerStats;
    }
}