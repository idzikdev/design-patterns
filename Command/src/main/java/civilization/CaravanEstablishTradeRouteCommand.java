package civilization;

public class CaravanEstablishTradeRouteCommand implements Command {
    Caravan caravan;

    public CaravanEstablishTradeRouteCommand(Caravan caravan) {
        this.caravan = caravan;
    }

    @Override
    public void execute() {
        System.out.println("Trade route established.");
    }

    @Override
    public void undo() {
        System.out.println("Trade route deleted.");
    }
}