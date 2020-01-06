package strategy;

public class main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println("They try to fly.\nDog:");
        dog.tryToFly();
        System.out.println("Bird:");
        bird.tryToFly();

        System.out.println("Meanwhile in parallel universe \nDog:");
        // can change behavior on the way!
        dog.setAbilityToFly(new CanFly());
        dog.tryToFly();
        System.out.println("Bird:");
        bird.setAbilityToFly(new CanNotFly());
        bird.tryToFly();
    }
}
