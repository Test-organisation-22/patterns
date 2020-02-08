package decorator;

public class App {

    public static void printInfo(ICar c, String s) {
        System.out.println(s);
        System.out.println("Cost: " + c.getCost() + "; Options: " + c.getOptions());
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("This program in an example of decorator design pattern");

        ICar basicCar = new BmwCar();
        printInfo(basicCar, "Basic car");

        ICar comfortCar = new WithABS(basicCar);
        printInfo(comfortCar, "Comfort car");

        ICar gpsCar = new WithGPS(basicCar);
        printInfo(gpsCar, "GPS car");

        ICar comfortPlusCar = new WithGPS(new WithABS(new BmwCar()));
        printInfo(comfortPlusCar, "Comfort+ car");

        ICar eliteCar = new WithSeatHeating(comfortPlusCar);
        printInfo(eliteCar, "Elite car");

        ICar anyLadaCar = new LadaCar();
        printInfo(anyLadaCar, "Lada Car");
    }
}
