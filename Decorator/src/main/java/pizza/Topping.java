package pizza;

public enum Topping {
    BACON(4),
    HAM(3),
    MUSHROOMS(2),
    OLIVES(3);

    private int value;

    private Topping(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}