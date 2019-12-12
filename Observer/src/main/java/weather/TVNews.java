package weather;

public class TVNews extends BaseLogger implements Observer {
    @Override
    public void update(WeatherForecast weatherForecast) {
        logger.info("TV - " + weatherForecast);
    }
}