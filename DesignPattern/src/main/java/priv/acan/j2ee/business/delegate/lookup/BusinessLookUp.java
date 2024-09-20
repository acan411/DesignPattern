package priv.acan.j2ee.business.delegate.lookup;

import priv.acan.j2ee.business.delegate.constant.ServiceType;
import priv.acan.j2ee.business.delegate.intf.BusinessService;
import priv.acan.j2ee.business.delegate.intf.impl.EJBService;
import priv.acan.j2ee.business.delegate.intf.impl.JMSService;

/**
 * @author acan
 * @since 2023/03/04 14:43
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(ServiceType serviceType) {
        return switch (serviceType) {
            case EJB -> new EJBService();
            case JMS -> new JMSService();
        };
    }
}
