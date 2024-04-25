package priv.acan.creational.prototype.manager;

import priv.acan.creational.prototype.manager.ab.Shape;
import priv.acan.creational.prototype.manager.ab.impl.Circle;
import priv.acan.creational.prototype.manager.ab.impl.Rectangle;
import priv.acan.creational.prototype.manager.ab.impl.Square;

import java.util.Hashtable;

public class ShapeCache {

    private static final Hashtable<Integer, Shape> SHAPE_MAP = new Hashtable<>();

    public static void loadCache() {
        SHAPE_MAP.put(1, new Circle(1));
        SHAPE_MAP.put(2, new Square(2));
        SHAPE_MAP.put(3, new Rectangle(3));
    }

    public static Shape getShape(Integer shapeId) {
        return SHAPE_MAP.get(shapeId).clone();
    }
}
