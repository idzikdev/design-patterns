package boxer;

public class Boxer {
    private String name;
    private Punch punch;

    public Boxer(String name) {
        this.name = name;
    }

    public void setPunch(Punch punch) {
        this.punch = punch;
    }

    public String punch() {
        return this.punch.punch();
    }
}