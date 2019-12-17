package civilization;

public class WorkerBuildMineCommand implements Command {
    private Worker worker;

    public WorkerBuildMineCommand(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        System.out.println("Mine builded.");
    }

    @Override
    public void undo() {
        System.out.println("Mine destroyed.");
    }
}