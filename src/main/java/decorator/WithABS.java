package decorator;

public class WithABS extends CarDecorator {

    public WithABS(ICar c) {
        super(c);
        type = "with ABS";
        cost = super.getCost() + 500;
        options = super.getOptions() + ", ABS";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getCost() { // Overriding methods defined in the abstract superclass
        return cost;
    }

    @Override
    public String getOptions() {
        return options;
    }
}
