package decorator;

public class Comfort extends CarDecorator {

    public Comfort(Car c) {
        super(c);
    }

    @Override
    public double getCost() { // Overriding methods defined in the abstract superclass
        return super.getCost() + 500;
    }

    @Override
    public String getOptions() {
        return super.getOptions() + ", GPS Navi";
    }
}
