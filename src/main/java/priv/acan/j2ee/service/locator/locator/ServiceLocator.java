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

    private ServiceLocator() {
    }

    private static final Cache CACHE = new Cache();

    public static Service getService(Jndi jndi) {
        Service service = CACHE.getService(jndi);
        if (service == null) {
            service = InitialContext.lookup(jndi);
            CACHE.addService(service);
        }
        return service;
    }
}
