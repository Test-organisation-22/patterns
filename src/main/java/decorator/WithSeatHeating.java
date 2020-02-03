package decorator;

public class WithSeatHeating extends CarDecorator {

    public WithSeatHeating(ICar c) {
        super(c);
        type = "with seat heating";
        cost = super.getCost() + 2000;
        options = super.getOptions() + ", seat heating";
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
