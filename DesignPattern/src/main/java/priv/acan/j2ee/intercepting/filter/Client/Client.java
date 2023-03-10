package priv.acan.j2ee.intercepting.filter.Client;

import lombok.Setter;
import priv.acan.j2ee.intercepting.filter.manager.FilterManager;

/**
 * @author acan
 * @version 2023/03/09 20:52
 */
@Setter
public class Client {

    private FilterManager filterManager;

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
