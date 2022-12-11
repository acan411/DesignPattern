package priv.acan.creational.factory.impl;

import priv.acan.creational.factory.in.Shape;

/**
 * @author acan
 * @version 2022/12/12 02:53
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
