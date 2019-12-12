package order;

public interface Observable {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}