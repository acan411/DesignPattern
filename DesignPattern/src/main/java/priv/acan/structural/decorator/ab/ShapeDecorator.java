package priv.acan.structural.decorator.ab;

import priv.acan.structural.decorator.in.Shape;

/**
 * @author acan
 * @version 2022/12/17 15:27
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    protected ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
