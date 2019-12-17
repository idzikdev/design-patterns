package civilization;

public class WorkerBuildFarmCommand implements Command {
    private Worker worker;

    public WorkerBuildFarmCommand(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        System.out.println("Farm builded.");
    }

    @Override
    public void undo() {
        System.out.println("Farm destroyed.");
    }
}