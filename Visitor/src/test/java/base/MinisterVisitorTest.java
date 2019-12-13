package base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(Parameterized.class)
public class MinisterVisitorTest extends BaseTest {
    private DataProvider dataProvider;

    public MinisterVisitorTest(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Parameters
    public static List<DataProvider> data() {
        return Arrays.asList(new DataProvider(
                new Soldier("James", 50, "laser"),
                new Sectoid("leader", 100, 120, "Heavy Plasma"),
                new Tank("Rudy-101", 150, "plasma beam", 100),
                Arrays.asList(50, 360, 150)
        ));
    }

    @Test
    public void Minister_visitor_test() {
        MinisterOfDefenseVisitor ministerOfDefenseVisitor = new MinisterOfDefenseVisitor("Minister person");

        assertThat(dataProvider.getSoldier().accept(ministerOfDefenseVisitor))
                .as("soldier test")
                .isEqualTo(dataProvider.getExpectedList().get(0));

        assertThat(dataProvider.getSectoid().accept(ministerOfDefenseVisitor))
                .as("sectoid test")
                .isEqualTo(dataProvider.getExpectedList().get(1));

        assertThat(dataProvider.getTank().accept(ministerOfDefenseVisitor))
                .as("tank test")
                .isEqualTo(dataProvider.getExpectedList().get(2));
    }
}