package observer;

public class App {

    public static void main(String[] args) {

        ConcreteSubject subjectToObserve = new ConcreteSubject();

        IObserver observer1 = new ConcreteObserver(subjectToObserve, "Observer 1");
        IObserver observer2 = new ConcreteObserver(subjectToObserve, "Observer 2");
        subjectToObserve.addObserver(observer1);
        subjectToObserve.addObserver(observer2);

        subjectToObserve.setStatus(1);
        subjectToObserve.setStatus(2);

    }

}
