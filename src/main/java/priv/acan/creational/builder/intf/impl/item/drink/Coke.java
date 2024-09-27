package priv.acan.creational.builder.intf.impl.item.drink;

import priv.acan.creational.builder.intf.impl.item.abst.Drink;

/**
 * @author acan
 * @since 2022/12/12 03:54
 */
public class Coke extends Drink {

    @Override
    public String name() {
        return "Coke::name";
    }

    @Override
    public double price() {
        return 333.333;
    }
}
