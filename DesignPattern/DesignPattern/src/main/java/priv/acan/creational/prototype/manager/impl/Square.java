package priv.acan.creational.prototype.manager.impl;

import priv.acan.creational.prototype.manager.ab.Shape;

public class Square extends Shape {

    public Square() {
        type = "square";
    }

    public Square(int id) {
        super(id);
        type = "square";
    }

    @Override
    protected void draw() {
        System.out.println("Square::draw()");
    }
}
