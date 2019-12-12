package pizza;

public abstract class Pizza {
    private String description;
    private int cost;

    public Pizza(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}