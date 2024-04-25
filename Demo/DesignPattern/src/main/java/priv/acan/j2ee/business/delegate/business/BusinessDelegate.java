package priv.acan.j2ee.business.delegate.business;

import priv.acan.j2ee.business.delegate.in.BusinessService;
import priv.acan.j2ee.business.delegate.lookup.BusinessLookUp;

/**
 * @author acan
 * @version 2023/03/04 14:46
 */
public class BusinessDelegate {

    private final BusinessLookUp lookupService = new BusinessLookUp();
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        BusinessService businessService = lookupService.getBusinessService(serviceType);
        if (businessService != null) {
            businessService.doProcessing();
        }
    }
}
