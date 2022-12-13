package acan.creational.builder.in.impl.item.burger;

import acan.creational.builder.in.impl.item.ab.Burger;

/**
 * @author acan
 * @version 2022/12/12 03:53
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger::name()";
    }

    @Override
    public double price() {
        return 999.999;
    }
}
