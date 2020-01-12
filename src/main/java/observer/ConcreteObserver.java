package observer;

public class ConcreteObserver implements IObserver, IPrint {

    private final String name;
    private ConcreteSubject subjectToObserve;

    ConcreteObserver(ConcreteSubject subjectToObserve, String name){
        this.subjectToObserve = subjectToObserve;
        this.name = name;
    }

    @Override
    public void update() {
        print(subjectToObserve.getStatus());
    }

    @Override
    public void print(Integer updatedStatus) {
        System.out.println(name + ". Status of the Subject has been updated. Status = " + updatedStatus);
    }
}
