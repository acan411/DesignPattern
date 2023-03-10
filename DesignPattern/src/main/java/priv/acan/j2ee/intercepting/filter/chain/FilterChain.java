package priv.acan.j2ee.intercepting.filter.chain;

import priv.acan.j2ee.intercepting.filter.in.Filter;
import priv.acan.j2ee.intercepting.filter.target.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @version 2023/03/09 20:46
 */
public class FilterChain {

    private final List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
