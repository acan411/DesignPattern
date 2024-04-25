package priv.acan.j2ee.service.locator.context;

import priv.acan.j2ee.service.locator.in.impl.Service1;
import priv.acan.j2ee.service.locator.in.impl.Service2;

/**
 * @author acan
 * @version 2023/03/09 21:18
 */
public class InitialContext {
    public Object lookup(String jndiName) {
        switch (jndiName.toUpperCase()) {
            case "SERVICE1" -> {
                System.out.println("Looking up and creating a new Service1 object");
                return new Service1();
            }
            case "SERVICE2" -> {
                System.out.println("Looking up and creating a new Service2 object");
                return new Service2();
            }
            default -> {
                return null;
            }
        }
    }
}
