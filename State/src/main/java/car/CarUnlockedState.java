package car;

import static car.Info.HAVE_TO_START_ENGINE;
import static car.Info.HAVE_TO_START_DRIVING;
import static car.Info.JUST_LOCKED;
import static car.Info.JUST_STARTED_ENGINE;
import static car.Info.ALREADY_UNLOCKED;

public class CarUnlockedState extends BaseLogger implements State {

    @Override
    public void startEngine(Car car) {
        logger.info(JUST_STARTED_ENGINE.getDescription());
        car.state = new EngineStartedState();
    }

    @Override
    public void stopEngine(Car car) {
        logger.info(HAVE_TO_START_ENGINE.getDescription());
    }

    @Override
    public void open(Car car) {
        logger.info(ALREADY_UNLOCKED.getDescription());
    }

    @Override
    public void close(Car car) {
        logger.info(JUST_LOCKED.getDescription());
        car.state = new CarLockedState();
    }

    @Override
    public void startDriving(Car car) {
        logger.info(HAVE_TO_START_ENGINE.getDescription());
    }

    @Override
    public void stopDriving(Car car) {
        logger.info(HAVE_TO_START_DRIVING.getDescription());
    }
}