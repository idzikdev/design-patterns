package civilization;

public class WorkerBuildMineCommand extends BaseLogger implements Command {
    private Worker worker;

    public WorkerBuildMineCommand(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        logger.info("Mine builded.");
    }

    @Override
    public void undo() {
        logger.info("Mine destroyed.");
    }
}