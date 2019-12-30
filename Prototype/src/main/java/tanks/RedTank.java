package tanks;

public class RedTank extends TankPrototype {
    private int position;
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

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}