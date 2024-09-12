package priv.acan.behavioral.state;

import priv.acan.behavioral.state.context.Context;
import priv.acan.behavioral.state.intf.impl.StartState;
import priv.acan.behavioral.state.intf.impl.StopState;

/**
 * @author acan
 * @since 2023/03/03 20:30
 */
public class StateDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}