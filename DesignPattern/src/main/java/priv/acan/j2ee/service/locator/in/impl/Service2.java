package priv.acan.j2ee.service.locator.in.impl;

import priv.acan.j2ee.service.locator.in.Service;

/**
 * @author acan
 * @version 2023/03/09 21:14
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
