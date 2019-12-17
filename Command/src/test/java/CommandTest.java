import civilization.*;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommandTest {
    @Test
    public void command_pattern_test() {
        Worker worker = new Worker();
        Caravan caravan = new Caravan();
        Units units = new Units();
        units.addToList(new WorkerBuildFarmCommand(worker));
        units.addToList(new WorkerBuildMineCommand(worker));
        units.addToList(new CaravanMoveToAnotherCityCommand(caravan));
        units.addToList(new CaravanEstablishTradeRouteCommand(caravan));
        units.undoLastCommand();
        assertThat(units.getList().get(units.getList().size() - 1))
                .as("pattern test")
                .isInstanceOf(CaravanMoveToAnotherCityCommand.class);
    }
}