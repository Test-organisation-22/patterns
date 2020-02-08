package decorator;

public class App {

    public static void printInfo(Car c, String s) {
        System.out.println(s);
        System.out.println("Cost: " + c.getCost() + "; Options: " + c.getOptions());
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("This program in an example of decorator design pattern");

        Car basicCar = new BmwCar();
        printInfo(basicCar, "Basic car");

        Car comfortCar = new WithABS(basicCar);
        printInfo(comfortCar, "Comfort car");

        Car gpsCar = new WithGPS(basicCar);
        printInfo(gpsCar, "GPS car");

        Car comfortPlusCar = new WithGPS(new WithABS(new BmwCar()));
        printInfo(comfortPlusCar, "Comfort+ car");

        Car eliteCar = new WithSeatHeating(comfortPlusCar);
        printInfo(eliteCar, "Elite car");

        Car anyLadaCar = new LadaCar();
        printInfo(anyLadaCar, "Lada Car");
    }
}
