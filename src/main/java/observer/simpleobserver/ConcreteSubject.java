package observer.simpleobserver;

import java.util.ArrayList;

public class ConcreteSubject implements ISubject {

    private Integer status;
    private ArrayList<IObserver> observers = new ArrayList();

    public Integer getStatus() {
        return status;
    }

    public void  setStatus(Integer statusValue){
        this.status = statusValue;
        notifyAllObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(IObserver o : observers) {
            o.update();
        }

    }
}
