package priv.acan.j2ee.service.locator.locator;

import priv.acan.j2ee.service.locator.cache.Cache;
import priv.acan.j2ee.service.locator.context.InitialContext;
import priv.acan.j2ee.service.locator.in.Service;

/**
 * @author acan
 * @version 2023/03/09 21:25
 */
public class ServiceLocator {

    private static final Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {

        Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
