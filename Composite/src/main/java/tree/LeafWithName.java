package tree;

public class LeafWithName implements Component {
    private String name;

    public LeafWithName(String name) {
        this.name = name;
    }

    public void showContent() {
        System.out.println(getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}