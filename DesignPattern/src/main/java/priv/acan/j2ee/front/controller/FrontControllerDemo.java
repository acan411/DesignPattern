package priv.acan.j2ee.front.controller;

import priv.acan.j2ee.front.controller.controller.FrontController;

/**
 * @author acan
 * @since 2023/03/09 20:21
 */
public class FrontControllerDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
