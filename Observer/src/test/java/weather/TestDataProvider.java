package weather;

import java.util.*;

/**
 * test data for parametrized tests
 */
public class TestDataProvider {
    /**
     * list of observers
     */
    private List<Observer> list;

     /**
     * temperature
     */
    private int temperature;
    /**
     * pressure
     */
    private int pressure;

    /**
     * constructor
     *
     * @param temperature temperature
     * @param pressure    pressure
     * @param list        list of observers
     */
    public TestDataProvider(int temperature, int pressure, List<Observer> list) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.list=list;
    }

    /**
     * getter of temperatute
     *
     * @return temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * getter of pressure
     *
     * @return pressure
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * getter of observers list
     *
     * @return list of observers
     */
    public List<Observer> getList() {
        return list;
    }
}