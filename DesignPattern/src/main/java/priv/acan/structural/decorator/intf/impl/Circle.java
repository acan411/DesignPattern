package priv.acan.structural.decorator.intf.impl;

import priv.acan.structural.decorator.intf.Shape;

/**
 * @author acan
 * @since 2022/12/17 15:26
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw");
    }
}
