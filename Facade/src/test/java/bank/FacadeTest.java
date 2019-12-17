package bank;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FacadeTest {
    @Test
    public void facade_pattern_test() {
        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        assertThat(atmMachineFacade.withdrawMoney(200))
                .as("facade test")
                .isEqualTo("Withdrawal success");
    }
}