package car;

import static car.Info.HAVE_TO_STOP_ENGINE;
import static car.Info.HAVE_TO_STOP_DRIVING;
import static car.Info.JUST_STOP_DRIVING;
import static car.Info.ALREADY_UNLOCKED;
import static car.Info.ALREADY_START_DRIVING;

public class StartedDrivingState extends BaseLogger implements State {

    @Override
    public void startEngine(Car car) {
        logger.info(HAVE_TO_STOP_ENGINE.getDescription());
    }

    @Override
    public void stopEngine(Car car) {
        logger.info(HAVE_TO_STOP_DRIVING.getDescription());
    }

    @Override
    public void open(Car car) {
        logger.info(ALREADY_UNLOCKED.getDescription());
    }

    @Override
    public void close(Car car) {
        logger.info(HAVE_TO_STOP_DRIVING.getDescription());
    }

    @Override
    public void startDriving(Car car) {
        logger.info(ALREADY_START_DRIVING.getDescription());
    }

    @Override
    public void stopDriving(Car car) {
        logger.info(JUST_STOP_DRIVING.getDescription());
        car.state = new StoppedDrivingState();
    }
}