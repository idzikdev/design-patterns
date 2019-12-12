package weather;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * observer test
 * parametized
 * runs on junit4
 */
@RunWith(Parameterized.class)
public class WeatherTest extends BaseTest {

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
    public WeatherTest(TestDataProvider testDataProvider) {
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
                new TestDataProvider(11, 10, new ArrayList<>()),
                new TestDataProvider(-11, 12, new ArrayList<>()),
                new TestDataProvider(12, 10, new ArrayList<>())
        );
    }

    /**
     * unit test of changeForecast method
     */
    @Test
    public void should_change_temperature_and_pressure() {
        assertThat(Tools.changeWeather(weather).getTemperature())
                .as("checking temperature change").
                isEqualTo(testDataProvider.getTemperature());
        assertThat(Tools.changeWeather(weather).getPressure())
                .as("checking pressure change")
                .isEqualTo(testDataProvider.getPressure());
    }
}