package priv.acan.creational.abst.factory;

import priv.acan.creational.abst.factory.in.Color;
import priv.acan.creational.abst.factory.in.Shape;
import priv.acan.creational.abst.factory.manager.FactoryContext;
import priv.acan.creational.abst.factory.manager.ab.AbstractFactory;

/**
 * @author acan
 * @since 2022/12/12 03:23
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryContext.getFactory("shape");
        assert shapeFactory != null;
        Shape circle = shapeFactory.getShape("circle");
        assert circle != null;
        circle.draw();

        AbstractFactory colorFactory = FactoryContext.getFactory("color");
        assert colorFactory != null;
        Color color = colorFactory.getColor("red");
        assert color != null;
        color.fill();
    }
}
