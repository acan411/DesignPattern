package priv.acan.creational.ab.factory.manager.factory;

import priv.acan.creational.ab.factory.in.Color;
import priv.acan.creational.ab.factory.in.Shape;
import priv.acan.creational.ab.factory.in.impl.shape.Circle;
import priv.acan.creational.ab.factory.in.impl.shape.Rectangle;
import priv.acan.creational.ab.factory.in.impl.shape.Square;
import priv.acan.creational.ab.factory.manager.ab.AbstractFactory;


/**
 * @author acan
 * @since 2022/12/12 03:14
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
