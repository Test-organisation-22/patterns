package decorator;

public class Elite extends CarDecorator {

    public Elite(Car c) {
        super(c);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1300;
    }

    @Override
    public String getOptions() {
        return super.getOptions() + ", Inelegant assistants";
    }
}
