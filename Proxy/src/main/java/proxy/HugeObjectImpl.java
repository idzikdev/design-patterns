package proxy;

public class HugeObjectImpl implements HugeObject {
    public HugeObjectImpl() {
        heavyConfig();
    }

    public void process() {
        System.out.println("Processing completed...");
    }

    private void heavyConfig() {
        System.out.println("Loading heavy config...");
    }
}