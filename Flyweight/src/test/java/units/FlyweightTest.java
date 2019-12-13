package units;

import org.junit.Test;
import weather.BaseTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlyweightTest extends BaseTest {
    @Test
    public void flyweight_test() {
        String name = "Destroyer";
        int hp = 120;
        int armor = 140;
        int damage = 220;
        int speed = 100;
        int resource = 20;
        Destroyer tank = new Destroyer(0, 0);
        assertThat(tank.getStats().getName()).isEqualTo(name);
        assertThat(tank.getStats().getHp()).isEqualTo(hp);
        assertThat(tank.getStats().getArmour()).isEqualTo(armor);
        assertThat(tank.getStats().getDamage()).isEqualTo(damage);
        assertThat(tank.getStats().getSpeed()).isEqualTo(speed);
        assertThat(tank.getStats().getResourceCost()).isEqualTo(resource);
    }
}