package observer.watherdata;

import java.util.ArrayList;

public class WeatherData implements SubjectToObserve {

    private Double humidity;
    private Double temperature;
    private Double pressure;
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(Double temperature, Double humidity, Double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @java.lang.Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @java.lang.Override
    public void deleteObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @java.lang.Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }
}
