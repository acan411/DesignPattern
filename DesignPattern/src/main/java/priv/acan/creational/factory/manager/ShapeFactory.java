package priv.acan.creational.factory.manager;

import priv.acan.creational.factory.constant.ShapeType;
import priv.acan.creational.factory.intf.Shape;
import priv.acan.creational.factory.intf.impl.Circle;
import priv.acan.creational.factory.intf.impl.Rectangle;
import priv.acan.creational.factory.intf.impl.Square;

/**
 * @author acan
 * @since 2022/12/12 02:54
 */
public class ShapeFactory {

    public Shape getShape(ShapeType shapeFactory) {
        return switch (shapeFactory) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
