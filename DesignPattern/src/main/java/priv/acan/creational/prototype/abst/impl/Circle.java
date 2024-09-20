package priv.acan.creational.prototype.abst.impl;

import priv.acan.creational.prototype.abst.Shape;
import priv.acan.creational.prototype.constant.ShapeType;

public class Circle extends Shape {

    public Circle() {
        setType();
    }

    @Override
    protected void setType() {
        type = ShapeType.CIRCLE.getType();
    }

    @Override
    protected void draw() {
        System.out.println("Circle::draw");
    }
}
