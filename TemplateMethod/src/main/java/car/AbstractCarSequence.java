package car;

public abstract class AbstractCarSequence {
    public final void startCar() {
        fastenSeatbelts();
        startEngine();
        selectGear();
        drive();
    }

    private void drive() {
        System.out.println("Driving");
    }

    private void fastenSeatbelts() {
        System.out.println("Fasting seatbelts");
    }

    protected abstract void selectGear();

    protected abstract void startEngine();
}