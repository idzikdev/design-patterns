package bank;

public class AtmMachine {
    int checkBalance() {
        return 20;
    }

    void enterPin(int number) {
        System.out.println("Pin entered.");
    }

    void withdrawCash(int number) {
        System.out.println("Withdrawal success");
    }
}