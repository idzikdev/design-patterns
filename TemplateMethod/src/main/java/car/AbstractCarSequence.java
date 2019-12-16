package car;

public abstract class AbstractCarSequence {
    public final String[] startCar() {
        String [] result=new String[4];
        result[0]=fastenSeatbelts();
        result[1]=startEngine();
        result[2]=selectGear();
        result[3]=drive();
        return result;
    }

    private String drive() {
        return "Driving";
    }

    private String fastenSeatbelts() {
        return "Fasting seatbelts";
    }

    protected abstract String selectGear();

    protected abstract String startEngine();
}