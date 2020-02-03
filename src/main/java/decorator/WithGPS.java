package decorator;

public class WithGPS extends CarDecorator {

    public WithGPS(ICar c) {
        super(c);
        type = "with GPS Navi";
        cost = super.getCost() + 1300;
        options = super.getOptions() + ", GPS Navi";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getOptions() {
        return options;
    }
}
