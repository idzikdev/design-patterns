package bank;

public class AtmMachineFacade {
    AtmMachine atmMachine;
    BankSystem bankSystem;

    public AtmMachineFacade() {
        this.atmMachine = new AtmMachine();
        this.bankSystem = new BankSystem();
    }

    void withdrawMoney(int number) {
        atmMachine.withdrawCash(number);
    }
}