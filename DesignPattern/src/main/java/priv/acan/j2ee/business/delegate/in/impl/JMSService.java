package priv.acan.j2ee.business.delegate.in.impl;

import priv.acan.j2ee.business.delegate.in.BusinessService;

/**
 * @author acan
 * @version 2023/03/04 14:41
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
