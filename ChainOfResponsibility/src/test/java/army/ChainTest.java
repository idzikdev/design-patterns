package army;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChainTest {
    @Test
    public void chain_of_responsibility_test() {
        Message message = new Message("Give us backup", 10, Rank.COMMANDER);
        Officer rookie = new Rookie();
        Officer captain = new Captain();
        Officer commander = new Commander();
        rookie.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(commander);
        assertThat(rookie.processMessage(message))
                .as("rookie taking message")
                .startsWith("Commander");
    }
}