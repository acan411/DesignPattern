package priv.acan.creational.prototype.abst.impl;

import priv.acan.creational.prototype.abst.Shape;
import priv.acan.creational.prototype.manager.ShapeType;

public class Square extends Shape {

    public Square() {
        setType();
    }

    @Override
    protected void setType() {
        type = ShapeType.SQUARE.getType();
    }

    @Override
    protected void draw() {
        System.out.println("Square::draw");
    }
}
