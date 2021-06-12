package observer.watherdata;

import observer.watherdata.service.WeatherMeasurements;

public class TestWeatherData {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        WeatherMeasurements weatherMeasurements = new WeatherMeasurements(12.2, 23.3, 233.6);

        weatherData.setMeasurements(weatherMeasurements);
        weatherMeasurements.setHumidity(12222.2);
        weatherData.setMeasurements(weatherMeasurements);


    }
}
