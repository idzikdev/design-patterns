package car;

public class Car {
    State state;

    public Car() {
        this.state = new CarLockedState();
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public void startEngine() {
        state.startEngine(this);
    }

    public void stopEngine() {
        state.stopEngine(this);
    }

    public void startDriving() {
        state.startDriving(this);
    }

    public void stopDriving() {
        state.stopDriving(this);
    }

    public State getState() {
        return state;
    }
}