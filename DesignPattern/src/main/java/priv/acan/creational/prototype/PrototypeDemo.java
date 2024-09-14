package priv.acan.creational.prototype;

import priv.acan.creational.prototype.manager.ShapeCache;
import priv.acan.creational.prototype.manager.ShapeType;

public class PrototypeDemo {

    public static void main(String[] args) {

        System.out.println(ShapeCache.getShape(ShapeType.CIRCLE).getType());
        System.out.println(ShapeCache.getShape(ShapeType.SQUARE).getType());
        System.out.println(ShapeCache.getShape(ShapeType.RECTANGLE).getType());
    }
}
