package observer.watherdata;

public interface SubjectToObserve {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();

}
