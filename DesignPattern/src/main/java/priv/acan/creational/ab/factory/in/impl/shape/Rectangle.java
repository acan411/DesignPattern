package priv.acan.creational.ab.factory.in.impl.shape;

import priv.acan.creational.ab.factory.in.Shape;

/**
 * @author acan
 * @since 2022/12/12 03:07
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
