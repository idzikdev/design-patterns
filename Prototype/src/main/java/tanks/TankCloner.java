package tanks;

public class TankCloner {
    public TankPrototype clone(TankPrototype tankPrototype) {
        return tankPrototype.copy();
    }
}