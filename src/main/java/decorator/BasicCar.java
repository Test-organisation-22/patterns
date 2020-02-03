package decorator;

public class BasicCar implements ICar {

    @Override
    public String getType() {
        return "has basic options";
    }

    @Override
    public int getCost() {
        return 1000;
    }

    @Override
    public String getOptions() {
        return "4 wheels";
    }
}