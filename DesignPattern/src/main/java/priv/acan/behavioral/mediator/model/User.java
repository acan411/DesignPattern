package priv.acan.behavioral.mediator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import priv.acan.behavioral.mediator.context.ChatRoom;

/**
 * @author acan
 * @version 2022/12/26 03:52
 */
@Data
@AllArgsConstructor
public class User {

    private String name;

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
