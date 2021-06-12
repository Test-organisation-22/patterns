package observer.watherdata;

import observer.watherdata.service.WeatherMeasurements;

import java.util.ArrayList;

public class WeatherData implements SubjectToObserve {

    private WeatherMeasurements weatherMeasurements;
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(WeatherMeasurements weatherMeasurements){
        this.weatherMeasurements = weatherMeasurements;
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
        observers.forEach(observer -> observer.update(weatherMeasurements));
    }
}
