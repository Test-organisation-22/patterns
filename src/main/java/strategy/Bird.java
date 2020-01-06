package strategy;

public class Bird extends Animal {

    public Bird(){
        super();
        abilityToFly = new CanFly();
    }

}
