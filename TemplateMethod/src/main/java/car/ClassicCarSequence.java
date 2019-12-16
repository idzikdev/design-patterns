package car;

public class ClassicCarSequence extends AbstractCarSequence {

    @Override
    protected void selectGear() {
        System.out.println("Manually selecting the gear");
    }

    @Override
    protected void startEngine() {
        System.out.println("Starting engine by inserting the key");
    }
}