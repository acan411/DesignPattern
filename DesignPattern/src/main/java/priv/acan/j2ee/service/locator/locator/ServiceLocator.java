package priv.acan.j2ee.service.locator.locator;

import priv.acan.j2ee.service.locator.cache.Cache;
import priv.acan.j2ee.service.locator.constant.Jndi;
import priv.acan.j2ee.service.locator.context.InitialContext;
import priv.acan.j2ee.service.locator.in.Service;

/**
 * @author acan
 * @since 2023/03/09 21:25
 */
public class ServiceLocator {

    private static final Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(Jndi jndi) {

        Service service = cache.getService(jndi);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = context.lookup(jndi);
        cache.addService(service1);
        return service1;
    }
}
