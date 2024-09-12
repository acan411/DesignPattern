package priv.acan.behavioral.observer.abst;

import priv.acan.behavioral.observer.context.Subject;

/**
 * @author acan
 * @since 2023/03/01 23:39
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
