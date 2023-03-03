package priv.acan.behavioral.observer.ab.impl;

import priv.acan.behavioral.observer.ab.Observer;
import priv.acan.behavioral.observer.context.Subject;

/**
 * @author acan
 * @version 2023/03/01 23:46
 */
public class HexObserver extends Observer {

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
