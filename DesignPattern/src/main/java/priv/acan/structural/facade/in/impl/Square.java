package priv.acan.structural.facade.in.impl;

import priv.acan.structural.facade.in.Shape;

/**
 * @author acan
 * @version 2022/12/17 23:27
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
