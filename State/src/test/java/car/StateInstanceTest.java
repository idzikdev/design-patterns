package car;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StateInstanceTest {
    @Test
    public void state_instance_test() {
        Car car = new Car();
        car.startDriving();
        assertThat(car.getState())
                .as("car locked test")
                .isInstanceOf(CarLockedState.class);
        car.open();
        car.startEngine();
        car.startDriving();
        assertThat(car.getState())
                .as("car driving state")
                .isInstanceOf(StartedDrivingState.class);
    }
}