package priv.acan.behavioral.observer.ab.impl;

import priv.acan.behavioral.observer.ab.Observer;
import priv.acan.behavioral.observer.context.Subject;

/**
 * @author acan
 * @version 2023/03/01 23:44
 */
public class OctalObserver extends Observer {

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
