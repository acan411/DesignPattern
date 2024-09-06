package priv.acan.j2ee.service.locator.cache;

import priv.acan.j2ee.service.locator.in.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2023/03/09 21:20
 */
public class Cache {

    private final List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached  " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
            }
        }
        if (!exists) {
            services.add(newService);
        }
    }
}
