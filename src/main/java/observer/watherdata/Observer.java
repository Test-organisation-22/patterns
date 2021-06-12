package observer.watherdata;

import observer.watherdata.service.WeatherMeasurements;

public interface Observer {

    void update(WeatherMeasurements measurements);

}
