package observer.watherdata.service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WeatherMeasurements {

    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherMeasurements(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

}
