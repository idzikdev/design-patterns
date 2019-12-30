package shapes;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(new RedColor());
        System.out.println(square.draw());
    }
}