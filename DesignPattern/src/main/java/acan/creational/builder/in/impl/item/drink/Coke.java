package acan.creational.builder.in.impl.item.drink;

import acan.creational.builder.in.impl.item.ab.Drink;

/**
 * @author acan
 * @version 2022/12/12 03:54
 */
public class Coke extends Drink {

    @Override
    public String name() {
        return "Coke:name()";
    }

    @Override
    public double price() {
        return 333.333;
    }
}
