public class RedTank extends TankPrototype {
    public RedTank() {
    }

    @Override
    public TankPrototype copy() {
        RedTank result = null;
        try {
            result = (RedTank) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Red tank";
    }
}