package car;

public class Main {
    public static void main(String[] args) {
        AbstractCarSequence automatic=new AutomaticGearCar();
        for (int i = 0; i < automatic.startCar().length; i++) {
            System.out.println(automatic.startCar()[i]);
        }
    }
}