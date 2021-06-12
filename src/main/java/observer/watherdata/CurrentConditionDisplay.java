package observer.watherdata;

import lombok.Getter;
import lombok.Setter;
import observer.watherdata.service.WeatherMeasurements;

@Getter
@Setter
public class CurrentConditionDisplay implements Observer, Displayable{

    private WeatherMeasurements weatherMeasurements;
    private SubjectToObserve weatherData;

    public CurrentConditionDisplay(SubjectToObserve weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("humidity " + weatherMeasurements.getHumidity());
        System.out.println("temperature " + weatherMeasurements.getTemperature());
        System.out.println("pressure " + weatherMeasurements.getPressure());
    }

    @Override
    public void update(WeatherMeasurements measurements) {
        this.weatherMeasurements = measurements;
        display();
    }
}
