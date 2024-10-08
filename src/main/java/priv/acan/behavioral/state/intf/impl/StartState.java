package priv.acan.behavioral.state.intf.impl;

import priv.acan.behavioral.state.context.Context;
import priv.acan.behavioral.state.intf.State;


/**
 * @author acan
 * @since 2023/03/03 20:26
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
