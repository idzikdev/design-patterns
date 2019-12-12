package weather;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * observer test
 * parametized by class TestData
 * runs on junit4
 */
@RunWith(Parameterized.class)
public class ObserverTest extends BaseTest {

    /**
     * testdata for parametrized test
     */
    private TestDataProvider testDataProvider;
    /**
     * weather temporary
     */
    private Weather weather;

    /**
     * constructor
     *
     * @param testDataProvider
     */
    public ObserverTest(TestDataProvider testDataProvider) {
        this.testDataProvider = testDataProvider;
        weather = new Weather(testDataProvider.getTemperature(), testDataProvider.getPressure());
    }

    /**
     * returns a list of test data
     *
     * @return test data for parametrized test
     */
    @Parameterized.Parameters
    public static List<TestDataProvider> data() {
        return Arrays.asList(
                new TestDataProvider(11, 10, Arrays.asList(new InternetNews(), new RadioNews(), new TVNews())),
                new TestDataProvider(-11, 12, Arrays.asList(new RadioNews(), new RadioNews(), new TVNews())),
                new TestDataProvider(12, 10, Arrays.asList(new TVNews(), new TVNews(), new TVNews())));
    }

    /**
     * should add observers test
     */
    @Test
    public void should_add_observers() {
        assertThat(Tools.addObservers(testDataProvider.getList(), weather))
                .as("checking if add works")
                .isEqualTo(testDataProvider.getList().size());
    }

    /**
     * should remove observers test
     */
    @Test
    public void should_remove_observers() {
        assertThat(Tools.removeObservers(testDataProvider.getList(), weather))
                .as("checking if remove works")
                .isEqualTo(0);
    }
}