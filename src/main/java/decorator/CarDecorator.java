package decorator;

public abstract class CarDecorator implements Car {

    private final Car decoratedCar;

    public CarDecorator(Car c) {
        this.decoratedCar = c;
    }

    @Override
    public double getCost() {
        return decoratedCar.getCost();
    }

    @Override
    public String getOptions() {
        return decoratedCar.getOptions();
    }
}

