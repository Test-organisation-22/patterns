package decorator;

public abstract class Car implements ICar {

    protected String type;

    protected int cost;

    protected String options;

    @Override
    public String getType() {
        return "has basic options";
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public String getOptions() {
        return "4 wheels";
    }
}