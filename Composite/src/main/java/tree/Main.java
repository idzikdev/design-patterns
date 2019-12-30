package tree;

public class Main {
    public static void main(String[] args) {
        Component leaf1 = new LeafWithId(1);
        Component leaf2 = new LeafWithName("one");
        Composite composite = new Composite();
        composite.addLeaf(leaf1);
        composite.addLeaf(leaf2);
        composite.showContent();
    }
}