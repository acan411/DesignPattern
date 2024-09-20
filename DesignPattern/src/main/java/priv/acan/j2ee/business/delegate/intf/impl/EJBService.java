package priv.acan.j2ee.business.delegate.intf.impl;

import priv.acan.j2ee.business.delegate.intf.BusinessService;

/**
 * @author acan
 * @since 2023/03/04 14:41
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
