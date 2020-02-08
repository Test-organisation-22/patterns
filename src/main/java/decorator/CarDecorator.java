package decorator;

public abstract class CarDecorator extends Car {

    private final Car decoratedCar;

    public CarDecorator(Car c) {
        this.decoratedCar = c;
    }

    @Override
    public int getCost() {
        return decoratedCar.getCost();
    }

    @Override
    public String getOptions() {
        return decoratedCar.getOptions();
    }
}

