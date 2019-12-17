package civilization;

public class CaravanMoveToAnotherCityCommand implements Command {
    private Caravan caravan;

    public CaravanMoveToAnotherCityCommand(Caravan caravan) {
        this.caravan = caravan;
    }

    @Override
    public void execute() {
        System.out.println("Moved do another city.");
    }

    @Override
    public void undo() {
        System.out.println("Back to home city.");
    }
}