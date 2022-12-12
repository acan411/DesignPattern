package priv.acan.creational.prototype.manager.impl;

import priv.acan.creational.prototype.manager.ab.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "rectangle";
    }

    public Rectangle(int id) {
        super(id);
        type = "rectangle";
    }

    @Override
    protected void draw() {
        System.out.println("Rectangle::draw()");
    }
}
