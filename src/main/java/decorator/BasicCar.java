package decorator;

public class BasicCar implements Car {

    @Override
    public double getCost() {
        return 1000;
    }

    @Override
    public String getOptions() {
        return "Basic options";
    }
}