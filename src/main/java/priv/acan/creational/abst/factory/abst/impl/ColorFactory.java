package priv.acan.creational.abst.factory.abst.impl;

import priv.acan.creational.abst.factory.abst.AbstractFactory;
import priv.acan.creational.abst.factory.constant.ColorType;
import priv.acan.creational.abst.factory.constant.ShapeType;
import priv.acan.creational.abst.factory.intf.Color;
import priv.acan.creational.abst.factory.intf.Shape;
import priv.acan.creational.abst.factory.intf.impl.color.Blue;
import priv.acan.creational.abst.factory.intf.impl.color.Green;
import priv.acan.creational.abst.factory.intf.impl.color.Red;

/**
 * @author acan
 * @since 2022/12/12 03:21
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType colorType) {
        return switch (colorType) {
            case RED -> new Red();
            case BLUE -> new Blue();
            case GREEN -> new Green();
        };
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        return null;
    }
}
