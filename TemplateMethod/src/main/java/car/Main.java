package car;

public class Main {
    public static void main(String[] args) {
        AbstractCarSequence automatic=new AutomaticGearCar();
        automatic.startCar();
    }
}
