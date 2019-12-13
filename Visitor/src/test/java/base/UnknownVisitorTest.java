package base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(Parameterized.class)
public class UnknownVisitorTest extends BaseTest {
    private DataProvider dataProvider;

    public UnknownVisitorTest(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Parameters
    public static List<DataProvider> data() {
        return Arrays.asList(new DataProvider(
                new Soldier("Antoni", 100, "pistol"),
                new Sectoid("rookie", 100, 100, "plasma rifle"),
                new Tank("Rudy-102", 150, "plasma beam", 110),
                Arrays.asList(5, 5, 20)
        ));
    }

    @Test
    public void unknown_visitor_test() {
        UnknownVisitor unknownVisitor = new UnknownVisitor("Unknown person");

        assertThat(dataProvider.getSoldier().accept(unknownVisitor))
                .as("soldier test")
                .isEqualTo(dataProvider.getExpectedList().get(0));

        assertThat(dataProvider.getSectoid().accept(unknownVisitor))
                .as("sectoid test")
                .isEqualTo(dataProvider.getExpectedList().get(1));

        assertThat(dataProvider.getTank().accept(unknownVisitor))
                .as("tank test")
                .isEqualTo(dataProvider.getExpectedList().get(2));
    }
}