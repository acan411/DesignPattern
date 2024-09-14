package priv.acan.creational.abst.factory.intf.impl.color;

import priv.acan.creational.abst.factory.intf.Color;

/**
 * @author acan
 * @since 2022/12/12 03:11
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green::fill");
    }
}
