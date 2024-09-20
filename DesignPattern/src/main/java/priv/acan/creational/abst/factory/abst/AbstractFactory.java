package priv.acan.creational.abst.factory.abst;

import priv.acan.creational.abst.factory.intf.Color;
import priv.acan.creational.abst.factory.intf.Shape;
import priv.acan.creational.abst.factory.constant.ColorType;
import priv.acan.creational.abst.factory.constant.ShapeType;

/**
 * @author acan
 * @since 2022/12/12 03:12
 */
public abstract class AbstractFactory {

    public abstract Color getColor(ColorType colorType);

    public abstract Shape getShape(ShapeType shapeType);
}
