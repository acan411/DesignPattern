package priv.acan.j2ee.business.delegate;

import priv.acan.j2ee.business.delegate.business.BusinessDelegate;
import priv.acan.j2ee.business.delegate.client.Client;

/**
 * @author acan
 * @version 2023/03/04 14:48
 */
public class BusinessDelegateDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
