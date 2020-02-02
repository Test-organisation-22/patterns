package decorator;

public class App {

    public static void printInfo(Car c) {
        System.out.println("Cost: " + c.getCost() + "; Options: " + c.getOptions());
    }

    public static void main(String[] args) {

        System.out.println("This program in an example of decorator design pattern");

        Car basicCar = new BasicCar();
        printInfo(basicCar);

        Car comfortCar = new Comfort(basicCar);
        printInfo(comfortCar);

        Car comfortCar1 = new Comfort(new BasicCar());
        printInfo(comfortCar1);

        Car eliteCar = new Elite(new BasicCar());
        printInfo(eliteCar);
    }
}
