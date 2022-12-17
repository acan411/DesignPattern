package priv.acan.structural.decorator.ab.impl;

import priv.acan.structural.decorator.ab.ShapeDecorator;
import priv.acan.structural.decorator.in.Shape;

/**
 * @author acan
 * @version 2022/12/17 15:28
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("red border");
    }
}
