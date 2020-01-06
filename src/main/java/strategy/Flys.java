package strategy;

public interface Flys {

    void fly();
}

class CanFly implements Flys{

    @Override
    public void fly() {
        System.out.println("I do fly");
    }
}

class  CanNotFly implements Flys{

    @Override
    public void fly() {
        System.out.println("No way");
    }
}