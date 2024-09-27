package priv.acan.creational.builder.intf.impl.item.abst;

import priv.acan.creational.builder.intf.Item;
import priv.acan.creational.builder.intf.Packing;
import priv.acan.creational.builder.intf.impl.packing.Bottle;

/**
 * @author acan
 * @since 2022/12/12 03:49
 */
public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
