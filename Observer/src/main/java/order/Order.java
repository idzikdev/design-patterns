package order;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Order implements Observable {
    private int id;
    private Status status;
    private Set<Observer> registeredObservers = new HashSet<>();

    public Order(int id, Status status) {
        this.id = id;
        this.status = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers
        ) {
            observer.update(this);
        }
    }

    public void changeOrderStatus(Status status) {
        setStatus(status);
        notifyObservers();
    }
}