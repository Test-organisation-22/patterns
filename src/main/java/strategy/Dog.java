package strategy;

public class Dog extends Animal {

    public Dog(){
        super();
        abilityToFly = new CanNotFly();
    }

}
