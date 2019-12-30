package tree;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> list;

    public Composite() {
        this.list = new ArrayList<Component>();
    }

    public void showContent() {
        list.forEach(Component::showContent);
    }

    public void addLeaf(Component leaf) {
        list.add(leaf);
    }

    public void remove(Component leaf) {
        list.remove(leaf);
    }
}