package player;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(Parameterized.class)
public class MementoTest extends BaseTest {
    private DataProvider dataProvider;

    public MementoTest(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Parameters
    public static List<DataProvider> data() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        return Arrays.asList(
                new DataProvider(
                        "idzik",
                        50,
                        formatter.parse("2019-12-10 00:01:02 AM")),
                new DataProvider(
                        "viper",
                        100,
                        formatter.parse("2019-12-11 00:01:02 AM"))
        );
    }

    @Test
    public void memento_test() {
        PlayerData playerData = new PlayerData(dataProvider.getName(), dataProvider.getRespect(), dataProvider.getDate());
        PlayerCareTaker playerCareTaker = new PlayerCareTaker();
        String actual = playerCareTaker.addMemento(playerData.save());
        playerData.changeRespect(1);
        String expected = playerData.load(playerCareTaker.getMemento(0));
        assertThat(actual)
                .as("memento test")
                .isEqualTo(expected);
    }
}