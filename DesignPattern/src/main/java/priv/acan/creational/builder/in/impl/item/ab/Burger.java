package priv.acan.creational.builder.in.impl.item.ab;

import priv.acan.creational.builder.in.Item;
import priv.acan.creational.builder.in.Packing;
import priv.acan.creational.builder.in.impl.packing.Wrapper;

/**
 * @author acan
 * @since 2022/12/12 03:46
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract double price();
}
