package priv.acan.j2ee.service.locator;

import priv.acan.j2ee.service.locator.constant.Jndi;
import priv.acan.j2ee.service.locator.in.Service;
import priv.acan.j2ee.service.locator.locator.ServiceLocator;

/**
 * @author acan
 * @since 2023/03/09 21:30
 */
public class ServiceLocatorDemo {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService(Jndi.SERVICE1);
        service.execute();
        service = ServiceLocator.getService(Jndi.SERVICE2);
        service.execute();
        service = ServiceLocator.getService(Jndi.SERVICE1);
        service.execute();
        service = ServiceLocator.getService(Jndi.SERVICE2);
        service.execute();
    }
}
