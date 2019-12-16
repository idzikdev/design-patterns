package car;

public class AutomaticGearCar extends ClassicCarSequence {
    @Override
    protected void selectGear() {
        System.out.println("Automatic gear");
    }
}