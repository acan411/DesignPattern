package priv.acan.creational.factory;

import priv.acan.creational.factory.intf.Shape;
import priv.acan.creational.factory.manager.ShapeFactory;
import priv.acan.creational.factory.constant.ShapeType;

/**
 * @author acan
 * @since 2022/12/12 02:58
 */
public class FactoryDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();
    }
}
