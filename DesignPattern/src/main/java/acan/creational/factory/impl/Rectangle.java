package acan.creational.factory.impl;

import acan.creational.factory.in.Shape;

/**
 * @author acan
 * @version 2022/12/12 02:52
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
