package priv.acan.j2ee.intercepting.filter.manager;

import priv.acan.j2ee.intercepting.filter.chain.FilterChain;
import priv.acan.j2ee.intercepting.filter.intf.Filter;
import priv.acan.j2ee.intercepting.filter.target.Target;

/**
 * @author acan
 * @since 2023/03/09 20:49
 */
public class FilterManager {

    private final FilterChain filterChain = new FilterChain();

    public FilterManager(Target target) {
        filterChain.setTarget(target);
    }

    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
