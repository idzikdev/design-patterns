package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class CompositeTest {
    @Test
    public void composite_test() {
        Component leaf1 = new LeafWithId(1);
        Component leaf2 = new LeafWithName("one");
        Composite composite = new Composite();
        composite.addLeaf(leaf1);
        composite.addLeaf(leaf2);
        List<Component> list = composite.getList();
        assertThat(list)
                .as("has the same elements")
                .hasSameElementsAs(new ArrayList<>(Arrays.asList(leaf1, leaf2)));
    }
}