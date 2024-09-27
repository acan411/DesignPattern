package priv.acan.creational.factory.intf.impl;

import priv.acan.creational.factory.intf.Shape;

/**
 * @author acan
 * @since 2022/12/12 02:53
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw");
    }
}
