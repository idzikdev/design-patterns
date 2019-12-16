package car;

public class ClassicCarSequence extends AbstractCarSequence {

    @Override
    protected String selectGear() {
        return "Manually selecting the gear";
    }

    @Override
    protected String startEngine() {
        return "Starting engine by inserting the key";
    }
}