package priv.acan.creational.abst.factory.intf.impl.shape;

import priv.acan.creational.abst.factory.intf.Shape;

/**
 * @author acan
 * @since 2022/12/12 03:08
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle:draw");
    }
}
