package units;

public class MainFactory {
    private Factory factory;

    public MainFactory(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }
}