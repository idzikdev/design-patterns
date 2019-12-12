package weather;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Weather implements Observable {
    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<>();

    public Weather(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
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

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                '}';
    }

    public void changeForecast(int temperature, int pressure) {
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }
}