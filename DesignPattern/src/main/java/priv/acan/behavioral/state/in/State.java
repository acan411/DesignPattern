package priv.acan.behavioral.state.in;

import priv.acan.behavioral.state.context.Context;

/**
 * @author acan
 * @since 2023/03/03 20:19
 */
public interface State {

    void doAction(Context context);
}
