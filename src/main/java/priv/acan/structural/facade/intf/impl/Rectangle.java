package priv.acan.structural.facade.intf.impl;

import priv.acan.structural.facade.intf.Shape;

/**
 * @author acan
 * @since 2022/12/17 23:25
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw");
    }
}
