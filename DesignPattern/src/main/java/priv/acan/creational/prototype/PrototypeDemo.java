package priv.acan.creational.prototype;

import priv.acan.creational.prototype.constant.ShapeType;
import priv.acan.creational.prototype.manager.ShapeCache;

public class PrototypeDemo {

    public static void main(String[] args) {

        System.out.println(ShapeCache.getShape(ShapeType.CIRCLE).getType());
        System.out.println(ShapeCache.getShape(ShapeType.SQUARE).getType());
        System.out.println(ShapeCache.getShape(ShapeType.RECTANGLE).getType());
    }
}
