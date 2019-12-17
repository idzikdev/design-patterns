package civilization;

public class Main {
    public static void main(String[] args) {
        Worker worker=new Worker();
        Caravan caravan=new Caravan();
        Units units = new Units();
        units.addToList(new WorkerBuildFarmCommand(worker));
        units.addToList(new WorkerBuildMineCommand(worker));
        units.addToList(new CaravanMoveToAnotherCityCommand(caravan));
        units.addToList(new CaravanEstablishTradeRouteCommand(caravan));
        units.undoLastCommand();
        units.run();
    }
}