package priv.acan.creational.builder.intf.impl.item.abst;

import priv.acan.creational.builder.intf.Item;
import priv.acan.creational.builder.intf.Packing;
import priv.acan.creational.builder.intf.impl.packing.Wrapper;

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
