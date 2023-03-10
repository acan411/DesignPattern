package priv.acan.j2ee.front.controller.controller;

import priv.acan.j2ee.front.controller.dispatcher.Dispatcher;

/**
 * @author acan
 * @version 2023/03/09 20:17
 */
public class FrontController {

    private final Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        // 记录每一个请求
        trackRequest(request);
        // 对用户进行身份验证
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
