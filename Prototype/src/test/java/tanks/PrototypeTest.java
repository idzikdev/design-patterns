package tanks;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrototypeTest {
    @Test
    public void prototype_test() {
        TankCloner tankCloner = new TankCloner();
        RedTank redTank = new RedTank();
        RedTank cloned = (RedTank) tankCloner.clone(redTank);
        redTank.setPosition(1);
        cloned.setPosition(0);
        assertThat(redTank.getPosition())
                .as("getting position")
                .isEqualTo(1);
        assertThat(cloned.getPosition())
                .as("getting position")
                .isEqualTo(0);
    }
}