package tanks;

public class Main {
    public static void main(String[] args) {
        TankCloner tankCloner = new TankCloner();
        RedTank redTank = new RedTank();
        RedTank cloned = (RedTank) tankCloner.clone(redTank);
        System.out.println(redTank);
        System.out.println(cloned);
        System.out.println(System.identityHashCode(redTank));
        System.out.println(System.identityHashCode(cloned));
    }
}