package acan.creational.factory;

import acan.creational.factory.manager.ShapeFactory;
import acan.creational.factory.in.Shape;

/**
 * @author acan
 * @version 2022/12/12 02:58
 */
public class FactoryDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
