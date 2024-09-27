package priv.acan.j2ee.service.locator.in;

import priv.acan.j2ee.service.locator.constant.Jndi;

/**
 * @author acan
 * @since 2023/03/09 21:14
 */
public interface Service {

    Jndi getName();

    void execute();
}
