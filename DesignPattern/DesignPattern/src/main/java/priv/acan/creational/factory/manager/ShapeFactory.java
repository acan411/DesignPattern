package priv.acan.creational.factory.manager;

import priv.acan.creational.factory.impl.Circle;
import priv.acan.creational.factory.impl.Rectangle;
import priv.acan.creational.factory.impl.Square;
import priv.acan.creational.factory.in.Shape;

/**
 * @author acan
 * @version 2022/12/12 02:54
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
