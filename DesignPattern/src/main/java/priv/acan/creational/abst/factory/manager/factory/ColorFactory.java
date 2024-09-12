package priv.acan.creational.abst.factory.manager.factory;

import priv.acan.creational.abst.factory.in.Color;
import priv.acan.creational.abst.factory.in.Shape;
import priv.acan.creational.abst.factory.in.impl.color.Blue;
import priv.acan.creational.abst.factory.in.impl.color.Green;
import priv.acan.creational.abst.factory.in.impl.color.Red;
import priv.acan.creational.abst.factory.manager.ab.AbstractFactory;

/**
 * @author acan
 * @since 2022/12/12 03:21
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
