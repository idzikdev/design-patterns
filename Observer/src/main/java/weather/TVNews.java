package weather;

public class TVNews extends BaseLogger implements Observer {
    @Override
    public void update(Weather weather) {
        logger.info("TV - " + weather);
    }
}