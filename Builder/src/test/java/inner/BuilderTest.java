package inner;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuilderTest extends BaseTest {
    @Test
    public void builder_test() {
        UserData userData = new UserData.UserDataBuilder()
                .buildName("Tom")
                .buildSurname("Idzik")
                .buildAge(40)
                .build();
        assertThat(userData).isInstanceOf(UserData.class);
    }
}