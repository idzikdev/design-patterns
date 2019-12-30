package shapes;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgeTest {
    @Test
    public void shape_test() {
        Shape triangle = new Triangle(new BlueColor());
        assertThat(triangle.draw())
                .as("triangle color test")
                .isEqualTo("Triangle drawn.Filling with blue");
    }
}