package bank;

public class AtmMachine {
    int checkBalance() {
        return 20;
    }

    void enterPin(int number) {
        System.out.println("Pin entered.");
    }

    String withdrawCash(int number) {
        return "Withdrawal success";
    }
}