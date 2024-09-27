package priv.acan.behavioral.blank.factory;

import priv.acan.behavioral.blank.abst.AbstractCustomer;
import priv.acan.behavioral.blank.abst.impl.NullCustomer;
import priv.acan.behavioral.blank.abst.impl.RealCustomer;

import java.util.Set;

/**
 * @author acan
 * @since 2023/03/03 20:37
 */
public class CustomerFactory {

    public static final Set<String> SET = Set.of("Rob", "Joe", "Julie");

    public static AbstractCustomer getCustomer(String name) {
        if (SET.contains(name)) {
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }
}
