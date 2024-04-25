package priv.acan.behavioral.observer.ab;

import priv.acan.behavioral.observer.context.Subject;

/**
 * @author acan
 * @version 2023/03/01 23:39
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
