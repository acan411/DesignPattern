package priv.acan.j2ee.business.delegate.client;

import lombok.AllArgsConstructor;
import priv.acan.j2ee.business.delegate.business.BusinessDelegate;

/**
 * @author acan
 * @version 2023/03/04 14:48
 */
@AllArgsConstructor
public class Client {

    private BusinessDelegate businessService;

    public void doTask() {
        businessService.doTask();
    }
}
