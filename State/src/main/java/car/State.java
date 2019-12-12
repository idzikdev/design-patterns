package car;

public interface State {
    void startEngine(Car car);

    void stopEngine(Car car);

    void open(Car car);

    void close(Car car);

    void startDriving(Car car);

    void stopDriving(Car car);

}