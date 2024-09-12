package priv.acan.creational.abst.factory.in.impl.color;

import priv.acan.creational.abst.factory.in.Color;

/**
 * @author acan
 * @since 2022/12/12 03:11
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue:fill()");
    }
}
