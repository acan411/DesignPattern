package priv.acan.creational.ab.factory.manager.factory;

import priv.acan.creational.ab.factory.in.Color;
import priv.acan.creational.ab.factory.in.Shape;
import priv.acan.creational.ab.factory.in.impl.color.Blue;
import priv.acan.creational.ab.factory.in.impl.color.Green;
import priv.acan.creational.ab.factory.in.impl.color.Red;
import priv.acan.creational.ab.factory.manager.ab.AbstractFactory;

/**
 * @author acan
 * @version 2022/12/12 03:21
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        return switch (colorType.toLowerCase()) {
            default -> null;
            case "red" -> new Red();
            case "blue" -> new Blue();
            case "green" -> new Green();
        };
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
