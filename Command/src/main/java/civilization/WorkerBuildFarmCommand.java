package civilization;

public class WorkerBuildFarmCommand extends BaseLogger implements Command {
    private Worker worker;

    public WorkerBuildFarmCommand(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        logger.info("Farm builded.");
    }

    @Override
    public void undo() {
        logger.info("Farm destroyed.");
    }
}