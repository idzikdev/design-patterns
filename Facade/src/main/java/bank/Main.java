package bank;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade atmMachineFacade=new AtmMachineFacade();
        atmMachineFacade.withdrawMoney(200);
    }
}