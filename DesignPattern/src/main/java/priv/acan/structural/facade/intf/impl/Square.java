package priv.acan.structural.facade.intf.impl;

import priv.acan.structural.facade.intf.Shape;

/**
 * @author acan
 * @since 2022/12/17 23:27
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw");
    }
}
