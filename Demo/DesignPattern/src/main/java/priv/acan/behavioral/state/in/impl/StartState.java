package priv.acan.behavioral.state.in.impl;

import priv.acan.behavioral.state.context.Context;
import priv.acan.behavioral.state.in.State;


/**
 * @author acan
 * @version 2023/03/03 20:26
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
