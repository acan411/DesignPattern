package priv.acan.creational.factory.manager;

import priv.acan.creational.factory.in.Shape;
import priv.acan.creational.factory.in.impl.Circle;
import priv.acan.creational.factory.in.impl.Rectangle;
import priv.acan.creational.factory.in.impl.Square;

/**
 * @author acan
 * @since 2022/12/12 02:54
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
