package priv.acan.behavioral.observer.context;

import priv.acan.behavioral.observer.ab.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @version 2023/03/01 23:38
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
