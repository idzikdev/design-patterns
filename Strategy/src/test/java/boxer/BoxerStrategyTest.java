package boxer;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoxerStrategyTest extends BaseTest {
    /**
     * left punch test
     */
    @Test
    public void left_punch_test() {
        Boxer boxer = new Boxer("Rocky");
        boxer.setPunch(new LeftPunch());
        assertThat(boxer.punch())
                .as("left punch")
                .isEqualTo("Hits with left punch");
    }

    /**
     * right punch test
     */
    @Test
    public void right_punch_test() {
        Boxer boxer = new Boxer("Rocky");
        boxer.setPunch(new RightPunch());
        assertThat(boxer.punch())
                .as("right punch")
                .isEqualTo("Hits with right punch");
    }
}