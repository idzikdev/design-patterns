package weather;

public class RadioNews extends BaseLogger implements Observer {
    @Override
    public void update(WeatherForecast weatherForecast) {
        logger.info("Radio - " + weatherForecast);
    }
}