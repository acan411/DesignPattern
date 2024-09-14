package priv.acan.creational.prototype.manager;

import priv.acan.creational.prototype.abst.Shape;
import priv.acan.creational.prototype.abst.impl.Circle;
import priv.acan.creational.prototype.abst.impl.Rectangle;
import priv.acan.creational.prototype.abst.impl.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static final Map<Integer, Shape> SHAPE_MAP = new HashMap<>();

    static {
        SHAPE_MAP.put(ShapeType.CIRCLE.getId(), new Circle());
        SHAPE_MAP.put(ShapeType.SQUARE.getId(), new Square());
        SHAPE_MAP.put(ShapeType.RECTANGLE.getId(), new Rectangle());
    }

    public static Shape getShape(ShapeType shapeType) {
        return SHAPE_MAP.get(shapeType.getId()).clone();
    }
}
