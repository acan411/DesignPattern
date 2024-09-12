package priv.acan.behavioral.state.context;

import lombok.Getter;
import lombok.Setter;
import priv.acan.behavioral.state.intf.State;

/**
 * @author acan
 * @since 2023/03/03 20:20
 */
@Setter
@Getter
public class Context {

    private State state;

}
