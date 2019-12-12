package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.open();
        car.startEngine();
        car.startDriving();
        car.stopDriving();
        car.stopEngine();
        car.close();
    }
}