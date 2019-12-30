package proxy;

public class Main {
    public static void main(String[] args) {
        HugeObject object=new ProxyObject();
        object.process();
        object.process();
    }
}