package priv.acan.creational.builder.in.impl.item.burger;

import priv.acan.creational.builder.in.impl.item.ab.Burger;

/**
 * @author acan
 * @since 2022/12/12 03:52
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "VegBurger::name()";
    }

    @Override
    public double price() {
        return 666.666;
    }
}
