package priv.acan.creational.abst.factory.intf.impl.color;

import priv.acan.creational.abst.factory.intf.Color;

/**
 * @author acan
 * @since 2022/12/12 03:10
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red:fill");
    }
}
