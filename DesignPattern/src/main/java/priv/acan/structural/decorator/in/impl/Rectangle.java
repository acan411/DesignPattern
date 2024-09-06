package priv.acan.structural.decorator.in.impl;

import priv.acan.structural.decorator.in.Shape;

/**
 * @author acan
 * @since 2022/12/17 15:25
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
