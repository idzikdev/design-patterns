package car;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TemplateMethodTest {
    @Test
    public void template_method_test() {
        AbstractCarSequence automatic = new AutomaticGearCar();
        assertThat(automatic.startCar()[2])
                .as("automatic car")
                .isEqualTo("Automatic gear");
    }
}