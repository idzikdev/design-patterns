package bank;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade atmMachineFacade=new AtmMachineFacade();
        System.out.println(atmMachineFacade.withdrawMoney(200));
    }
}