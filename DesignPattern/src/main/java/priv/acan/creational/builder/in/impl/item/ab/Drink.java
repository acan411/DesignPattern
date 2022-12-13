package priv.acan.creational.builder.in.impl.item.ab;

import priv.acan.creational.builder.in.impl.packing.Bottle;
import priv.acan.creational.builder.in.Item;
import priv.acan.creational.builder.in.Packing;

/**
 * @author acan
 * @version 2022/12/12 03:49
 */
public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
