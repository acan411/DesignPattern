package priv.acan.j2ee.business.delegate.lookup;

import priv.acan.j2ee.business.delegate.in.BusinessService;
import priv.acan.j2ee.business.delegate.in.impl.EJBService;
import priv.acan.j2ee.business.delegate.in.impl.JMSService;

/**
 * @author acan
 * @since 2023/03/04 14:43
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        return switch (serviceType.toUpperCase()) {
            case "EJB" -> new EJBService();
            case "JMS" -> new JMSService();
            default -> null;
        };
    }
}
