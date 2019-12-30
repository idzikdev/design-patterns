package proxy;

public class ProxyObject implements HugeObject {
    private static HugeObject object;

    public void process() {
        if (object == null) {
            object = new HugeObjectImpl();
        }
        object.process();
    }
}