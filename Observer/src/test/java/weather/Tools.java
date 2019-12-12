package weather;

import java.util.List;

public class Tools {
    /**
     * adding observers to registered observers in weather object
     *
     * @param list list
     * @param weather weather
     * @return an amount of registered observers
     */
    public static int addObservers(List<Observer> list, Weather weather) {
        for (Observer observer : list
        ) {
            weather.registerObserver(observer);
        }
        return weather.getRegisteredObservers().size();
    }

    /**
     * removing observers from registered observers in weather object
     *
     * @param list list
     * @param weather weather
     * @return a size of registered observers set after removal of observers
     */
    public static int removeObservers(List<Observer> list, Weather weather) {
        for (Observer observer : list
        ) {
            weather.registerObserver(observer);
            weather.unregisterObserver(observer);
        }
        return weather.getRegisteredObservers().size();
    }

    /**
     * change Weather
     * @param weather
     * @return new weather with change of temperature and pressure
     */
    public static Weather changeWeather(Weather weather) {
        weather.changeForecast(weather.getTemperature(), weather.getPressure());
        return weather;
    }
}