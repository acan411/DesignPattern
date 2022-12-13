package priv.acan.creational.prototype.manager.impl;

import priv.acan.creational.prototype.manager.ab.Shape;

public class Circle extends Shape {

    public Circle() {
        type = "circle";
    }

    public Circle(int id) {
        super(id);
        type = "circle";
    }

    @Override
    protected void draw() {
        System.out.println("circle::draw()");
    }
}
