package civilization;

public class CaravanMoveToAnotherCityCommand extends BaseLogger implements Command {
    private Caravan caravan;

    public CaravanMoveToAnotherCityCommand(Caravan caravan) {
        this.caravan = caravan;
    }

    @Override
    public void execute() {
        logger.info("Moved do another city.");
    }

    @Override
    public void undo() {
        logger.info("Back to home city.");
    }
}