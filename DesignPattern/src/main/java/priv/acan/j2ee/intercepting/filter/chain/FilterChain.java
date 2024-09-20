package priv.acan.j2ee.intercepting.filter.chain;

import lombok.Setter;
import priv.acan.j2ee.intercepting.filter.intf.Filter;
import priv.acan.j2ee.intercepting.filter.target.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2023/03/09 20:46
 */
public class FilterChain {

    private final List<Filter> filters = new ArrayList<>();

    @Setter
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

}
