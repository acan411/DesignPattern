package priv.acan.creational.builder.intf.impl.item.drink;

import priv.acan.creational.builder.intf.impl.item.abst.Drink;

/**
 * @author acan
 * @since 2022/12/12 03:55
 */
public class Pepsi extends Drink {

    @Override
    public String name() {
        return "Pepsi::name";
    }

    @Override
    public double price() {
        return 111.111;
    }
}
