package civilization;

public class CaravanEstablishTradeRouteCommand extends BaseLogger implements Command {
    Caravan caravan;

    public CaravanEstablishTradeRouteCommand(Caravan caravan) {
        this.caravan = caravan;
    }

    @Override
    public void execute() {
        logger.info("Trade route established.");
    }

    @Override
    public void undo() {
        logger.info("Trade route deleted.");
    }
}