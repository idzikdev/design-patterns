package weather;

public class InternetNews extends BaseLogger implements Observer{
    @Override
    public void update(Weather weather) {
        logger.info("Internet - " + weather);
    }
}