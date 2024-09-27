package priv.acan.j2ee.front.controller.dispatcher;

import priv.acan.j2ee.front.controller.constant.Request;
import priv.acan.j2ee.front.controller.view.HomeView;
import priv.acan.j2ee.front.controller.view.StudentView;

/**
 * @author acan
 * @since 2023/03/09 20:14
 */
public class Dispatcher {

    private final StudentView studentView = new StudentView();
    private final HomeView homeView = new HomeView();

    public void dispatch(Request request) {
        switch (request) {
            case STUDENT -> studentView.show();
            case HOME -> homeView.show();
        }
    }
}
