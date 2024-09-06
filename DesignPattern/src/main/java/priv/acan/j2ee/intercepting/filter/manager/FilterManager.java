package priv.acan.j2ee.intercepting.filter.manager;

import priv.acan.j2ee.intercepting.filter.chain.FilterChain;
import priv.acan.j2ee.intercepting.filter.in.Filter;
import priv.acan.j2ee.intercepting.filter.target.Target;

/**
 * @author acan
 * @since 2023/03/09 20:49
 */
public class FilterManager {

    private final FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
