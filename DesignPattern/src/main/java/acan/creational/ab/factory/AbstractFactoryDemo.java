package acan.creational.ab.factory;

import acan.creational.ab.factory.in.Color;
import acan.creational.ab.factory.manager.FactoryContext;
import acan.creational.ab.factory.manager.ab.AbstractFactory;
import acan.creational.ab.factory.in.Shape;

/**
 * @author acan
 * @version 2022/12/12 03:23
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryContext.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryContext.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
    }
}
