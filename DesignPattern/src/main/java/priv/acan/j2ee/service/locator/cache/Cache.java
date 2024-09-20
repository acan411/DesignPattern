package priv.acan.j2ee.service.locator.cache;

import priv.acan.j2ee.service.locator.constant.Jndi;
import priv.acan.j2ee.service.locator.in.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acan
 * @since 2023/03/09 21:20
 */
public class Cache {

    private final Map<Jndi, Service> map = new HashMap<>();

    public Service getService(Jndi jndi) {
        Service service = map.get(jndi);
        // 记录日志
        if (service != null) {
            System.out.println("Returning cached  " + jndi.name() + " object");
        }
        return service;
    }

    public void addService(Service service) {
        map.putIfAbsent(service.getName(), service);
    }
}
