package priv.acan.creational.builder.intf.impl.packing;

import priv.acan.creational.builder.intf.Packing;

/**
 * @author acan
 * @since 2022/12/12 03:45
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle::pack";
    }
}
