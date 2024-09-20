package priv.acan.j2ee.intercepting.filter.intf.impl;

import priv.acan.j2ee.intercepting.filter.intf.Filter;

/**
 * @author acan
 * @since 2023/03/09 20:44
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
