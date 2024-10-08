package priv.acan.behavioral.observer;

import priv.acan.behavioral.observer.abst.impl.BinaryObserver;
import priv.acan.behavioral.observer.abst.impl.HexObserver;
import priv.acan.behavioral.observer.abst.impl.OctalObserver;
import priv.acan.behavioral.observer.context.Subject;

/**
 * @author acan
 * @since 2023/03/01 23:48
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
