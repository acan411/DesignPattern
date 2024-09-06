package priv.acan.j2ee.service.locator;

import priv.acan.j2ee.service.locator.in.Service;
import priv.acan.j2ee.service.locator.locator.ServiceLocator;

/**
 * @author acan
 * @since 2023/03/09 21:30
 */
public class ServiceLocatorDemo {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
