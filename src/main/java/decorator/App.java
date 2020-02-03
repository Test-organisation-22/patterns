package decorator;

public class App {

    public static void printInfo(ICar c, String s) {
        System.out.println(s);
        System.out.println("Cost: " + c.getCost() + "; Options: " + c.getOptions());
    }

    public static void main(String[] args) {

        System.out.println("This program in an example of decorator design pattern");

        ICar basicCar = new BasicCar();
        printInfo(basicCar, "Basic car");

        ICar comfortCar = new WithABS(basicCar);
        printInfo(comfortCar, "Comfort car");

        ICar ComfortPlusCar = new WithGPS(new WithABS(new BasicCar()));
        printInfo(ComfortPlusCar, "Comfort+ car");

        ICar eliteCar = new WithSeatHeating(ComfortPlusCar);
        printInfo(eliteCar, "Elite car");
    }
}
