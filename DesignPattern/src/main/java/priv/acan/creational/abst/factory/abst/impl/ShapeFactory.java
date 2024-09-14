package priv.acan.creational.abst.factory.abst.impl;

import priv.acan.creational.abst.factory.abst.AbstractFactory;
import priv.acan.creational.abst.factory.intf.Color;
import priv.acan.creational.abst.factory.intf.Shape;
import priv.acan.creational.abst.factory.intf.impl.shape.Circle;
import priv.acan.creational.abst.factory.intf.impl.shape.Rectangle;
import priv.acan.creational.abst.factory.intf.impl.shape.Square;
import priv.acan.creational.abst.factory.manager.ColorType;
import priv.acan.creational.abst.factory.manager.ShapeType;


/**
 * @author acan
 * @since 2022/12/12 03:14
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
