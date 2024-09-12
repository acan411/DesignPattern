package priv.acan.behavioral.observer.context;

import lombok.Getter;
import priv.acan.behavioral.observer.abst.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2023/03/01 23:38
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Getter
    private int state;

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
