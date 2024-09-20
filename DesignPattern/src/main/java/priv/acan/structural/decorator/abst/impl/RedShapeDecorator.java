package priv.acan.structural.decorator.abst.impl;

import priv.acan.structural.decorator.abst.ShapeDecorator;
import priv.acan.structural.decorator.intf.Shape;

/**
 * @author acan
 * @since 2022/12/17 15:28
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        decoratedShape.draw();
        System.out.println("red border");
    }
}
