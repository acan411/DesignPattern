package priv.acan.j2ee.business.delegate.business;

import lombok.Setter;
import priv.acan.j2ee.business.delegate.constant.ServiceType;
import priv.acan.j2ee.business.delegate.intf.BusinessService;
import priv.acan.j2ee.business.delegate.lookup.BusinessLookUp;

/**
 * @author acan
 * @since 2023/03/04 14:46
 */
public class BusinessDelegate {

    private final BusinessLookUp businessLookUp = new BusinessLookUp();

    @Setter
    private ServiceType serviceType;

    public void doTask() {
        BusinessService businessService = businessLookUp.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
