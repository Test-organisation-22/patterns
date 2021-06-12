package observer.watherdata;

public class TestWatherData {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(12.3, 22.0, 34.3);
        weatherData.setMeasurements(122.3, 21.0, 32.3);

    }
}
