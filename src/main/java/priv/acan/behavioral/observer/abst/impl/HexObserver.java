package priv.acan.behavioral.observer.abst.impl;

import priv.acan.behavioral.observer.abst.Observer;
import priv.acan.behavioral.observer.context.Subject;

/**
 * @author acan
 * @since 2023/03/01 23:46
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
