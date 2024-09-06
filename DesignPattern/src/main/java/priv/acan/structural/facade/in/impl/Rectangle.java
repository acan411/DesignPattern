package priv.acan.structural.facade.in.impl;

import priv.acan.structural.facade.in.Shape;

/**
 * @author acan
 * @since 2022/12/17 23:25
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
