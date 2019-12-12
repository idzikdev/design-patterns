package weather;

public class InternetNews extends BaseLogger implements Observer{
    @Override
    public void update(WeatherForecast weatherForecast) {
        logger.info("Internet - " + weatherForecast);
    }
}