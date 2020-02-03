package decorator;

public abstract class CarDecorator implements ICar {

    private final ICar decoratedCar;

    protected String type;

    protected int cost;

    protected String options;


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

