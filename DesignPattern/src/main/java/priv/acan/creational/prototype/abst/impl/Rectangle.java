package priv.acan.creational.prototype.abst.impl;

import priv.acan.creational.prototype.abst.Shape;
import priv.acan.creational.prototype.constant.ShapeType;

public class Rectangle extends Shape {

    public Rectangle() {
        setType();
    }

    @Override
    protected void setType() {
        type = ShapeType.RECTANGLE.getType();
    }

    @Override
    protected void draw() {
        System.out.println("Rectangle::draw");
    }
}
