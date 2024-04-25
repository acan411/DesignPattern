package priv.acan.behavioral.blank.factory;

import priv.acan.behavioral.blank.ab.AbstractCustomer;
import priv.acan.behavioral.blank.ab.impl.NullCustomer;
import priv.acan.behavioral.blank.ab.impl.RealCustomer;

/**
 * @author acan
 * @version 2023/03/03 20:37
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
