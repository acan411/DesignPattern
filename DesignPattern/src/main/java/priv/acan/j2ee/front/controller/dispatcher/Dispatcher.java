package priv.acan.j2ee.front.controller.dispatcher;

import priv.acan.j2ee.front.controller.view.HomeView;
import priv.acan.j2ee.front.controller.view.StudentView;

/**
 * @author acan
 * @version 2023/03/09 20:14
 */
public class Dispatcher {

    private final StudentView studentView;
    private final HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        switch (request.toUpperCase()) {
            case "STUDENT" -> studentView.show();
            case "HOME" -> homeView.show();
            default -> {
            }
        }
    }
}
