package priv.acan.creational.ab.factory.in.impl.shape;

import priv.acan.creational.ab.factory.in.Shape;

/**
 * @author acan
 * @version 2022/12/12 03:08
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
