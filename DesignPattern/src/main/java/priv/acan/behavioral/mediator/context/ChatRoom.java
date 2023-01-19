package priv.acan.behavioral.mediator.context;

import priv.acan.behavioral.mediator.model.User;

import java.util.Date;

/**
 * @author acan
 * @version 2022/12/26 03:51
 */
public class ChatRoom {

    private ChatRoom() {
    }

    public static void showMessage(User user, String message) {
        System.out.println(System.currentTimeMillis()
                + " [" + user.getName() + "] : " + message);
    }
}
