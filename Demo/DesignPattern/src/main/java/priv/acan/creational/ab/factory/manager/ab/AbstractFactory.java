package priv.acan.creational.ab.factory.manager.ab;

import priv.acan.creational.ab.factory.in.Color;
import priv.acan.creational.ab.factory.in.Shape;

/**
 * @author acan
 * @version 2022/12/12 03:12
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapeType);
}
