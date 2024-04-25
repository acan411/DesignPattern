package priv.acan.structural.decorator.in.impl;

import priv.acan.structural.decorator.in.Shape;

/**
 * @author acan
 * @version 2022/12/17 15:26
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
