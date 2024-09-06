package priv.acan.j2ee.service.locator.in.impl;

import priv.acan.j2ee.service.locator.in.Service;

/**
 * @author acan
 * @since 2023/03/09 21:14
 */
public class Service1 implements Service {

    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
