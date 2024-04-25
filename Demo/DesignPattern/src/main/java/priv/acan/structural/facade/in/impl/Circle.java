package priv.acan.structural.facade.in.impl;

import priv.acan.structural.facade.in.Shape;

/**
 * @author acan
 * @version 2022/12/17 23:26
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
