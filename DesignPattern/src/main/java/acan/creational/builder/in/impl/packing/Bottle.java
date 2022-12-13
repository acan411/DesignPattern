package acan.creational.builder.in.impl.packing;

import acan.creational.builder.in.Packing;

/**
 * @author acan
 * @version 2022/12/12 03:45
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle::pack()";
    }
}
