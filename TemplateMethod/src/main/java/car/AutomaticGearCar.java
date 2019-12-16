package car;

public class AutomaticGearCar extends ClassicCarSequence {
    @Override
    protected String selectGear() {
        return "Automatic gear";
    }
}