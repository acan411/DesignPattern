package priv.acan.behavioral.mediator;

import priv.acan.behavioral.mediator.model.User;

/**
 * @author acan
 * @since 2022/12/26 03:56
 */
public class MediatorDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
