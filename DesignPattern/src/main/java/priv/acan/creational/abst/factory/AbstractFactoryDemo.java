package priv.acan.creational.abst.factory;

import priv.acan.creational.abst.factory.abst.AbstractFactory;
import priv.acan.creational.abst.factory.intf.Color;
import priv.acan.creational.abst.factory.intf.Shape;
import priv.acan.creational.abst.factory.manager.ColorType;
import priv.acan.creational.abst.factory.manager.FactoryContext;
import priv.acan.creational.abst.factory.manager.FactoryType;
import priv.acan.creational.abst.factory.manager.ShapeType;

/**
 * @author acan
 * @since 2022/12/12 03:23
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryContext.getFactory(FactoryType.SHAPE);
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        AbstractFactory colorFactory = FactoryContext.getFactory(FactoryType.COLOR);
        Color color = colorFactory.getColor(ColorType.RED);
        color.fill();
    }
}
