package priv.acan.behavioral.observer.ab.impl;

import priv.acan.behavioral.observer.ab.Observer;
import priv.acan.behavioral.observer.context.Subject;

/**
 * @author acan
 * @since 2023/03/01 23:41
 */
public class BinaryObserver extends Observer {

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
