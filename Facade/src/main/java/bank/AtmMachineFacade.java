package bank;

public class AtmMachineFacade {
    AtmMachine atmMachine;
    BankSystem bankSystem;

    public AtmMachineFacade() {
        this.atmMachine = new AtmMachine();
        this.bankSystem = new BankSystem();
    }

    String withdrawMoney(int number) {
        return atmMachine.withdrawCash(number);
    }
}