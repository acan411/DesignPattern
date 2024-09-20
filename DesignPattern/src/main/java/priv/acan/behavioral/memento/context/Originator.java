package priv.acan.behavioral.memento.context;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import priv.acan.behavioral.memento.model.Memento;

/**
 * @author acan
 * @since 2022/12/26 04:03
 */
@Data
public class Originator {

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.state();
    }
}
