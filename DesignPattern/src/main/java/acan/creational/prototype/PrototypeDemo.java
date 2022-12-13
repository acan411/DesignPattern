package acan.creational.prototype;

import acan.creational.prototype.manager.ShapeCache;

public class PrototypeDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        System.out.println(ShapeCache.getShape(1).getType());
        System.out.println(ShapeCache.getShape(2).getType());
        System.out.println(ShapeCache.getShape(3).getType());

    }
}
