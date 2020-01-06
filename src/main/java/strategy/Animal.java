package strategy;

public class Animal {

    Flys abilityToFly;

    void setAbilityToFly(Flys abilityToFly){
        this.abilityToFly = abilityToFly;
    }

    public void tryToFly(){
        abilityToFly.fly();
    }

}
