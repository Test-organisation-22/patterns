package observer.watherdata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentConditionDisplay implements Observer, Displayable{

    private Double humidity;
    private Double temperature;
    private Double pressure;
    private SubjectToObserve weatherData;

    public CurrentConditionDisplay(SubjectToObserve weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("humidity " + getHumidity());
        System.out.println("temperature " + getTemperature());
        System.out.println("pressure " + getPressure());
    }

    @Override
    public void update(Double temp, Double hum, Double press) {
        this.setTemperature(temp);
        this.setHumidity(hum);
        this.setPressure(press);
        display();
    }
}
