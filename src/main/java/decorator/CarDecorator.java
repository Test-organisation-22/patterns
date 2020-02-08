package decorator;

public abstract class CarDecorator extends Car {

    private final ICar decoratedCar;

    public CarDecorator(ICar c) {
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

