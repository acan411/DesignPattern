package priv.acan.j2ee.business.delegate;

import priv.acan.j2ee.business.delegate.business.BusinessDelegate;
import priv.acan.j2ee.business.delegate.client.Client;
import priv.acan.j2ee.business.delegate.constant.ServiceType;

/**
 * @author acan
 * @since 2023/03/04 14:48
 */
public class BusinessDelegateDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);

        businessDelegate.setServiceType(ServiceType.EJB);
        client.doTask();

        businessDelegate.setServiceType(ServiceType.JMS);
        client.doTask();
    }
}
