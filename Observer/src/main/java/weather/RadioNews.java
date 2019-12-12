package weather;

public class RadioNews extends BaseLogger implements Observer {
    @Override
    public void update(Weather weather) {
        logger.info("Radio - " + weather);
    }
}