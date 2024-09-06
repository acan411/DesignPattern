package priv.acan.behavioral.state.context;

import priv.acan.behavioral.state.in.State;

/**
 * @author acan
 * @since 2023/03/03 20:20
 */
public class Context {

    private State state;

    public Context() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
