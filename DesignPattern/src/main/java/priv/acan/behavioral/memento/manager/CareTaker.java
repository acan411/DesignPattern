package priv.acan.behavioral.memento.manager;

import priv.acan.behavioral.memento.model.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @version 2022/12/26 04:06
 */
public class CareTaker {

    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
