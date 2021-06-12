package observer.simpleobserver;

public interface ISubject {

    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyAllObservers();
}
