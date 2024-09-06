package priv.acan.creational.ab.factory.in.impl.color;

import priv.acan.creational.ab.factory.in.Color;

/**
 * @author acan
 * @since 2022/12/12 03:11
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green::fill()");
    }
}
