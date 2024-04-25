package priv.acan.j2ee.intercepting.filter;

import priv.acan.j2ee.intercepting.filter.Client.Client;
import priv.acan.j2ee.intercepting.filter.in.impl.AuthenticationFilter;
import priv.acan.j2ee.intercepting.filter.in.impl.DebugFilter;
import priv.acan.j2ee.intercepting.filter.manager.FilterManager;
import priv.acan.j2ee.intercepting.filter.target.Target;

/**
 * @author acan
 * @version 2023/03/09 20:53
 */
public class InterceptingFilterDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
