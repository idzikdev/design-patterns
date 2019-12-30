package tree;

public class LeafWithId implements Component {
    private int id;

    public LeafWithId(int id) {
        this.id = id;
    }

    public void showContent() {
        System.out.println(getId());
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}