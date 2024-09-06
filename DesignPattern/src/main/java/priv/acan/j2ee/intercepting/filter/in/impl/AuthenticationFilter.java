package priv.acan.j2ee.intercepting.filter.in.impl;

import priv.acan.j2ee.intercepting.filter.in.Filter;

/**
 * @author acan
 * @since 2023/03/09 20:43
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
