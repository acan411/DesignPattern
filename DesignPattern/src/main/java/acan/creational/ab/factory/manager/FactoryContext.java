package acan.creational.ab.factory.manager;

import acan.creational.ab.factory.manager.ab.AbstractFactory;
import acan.creational.ab.factory.manager.factory.ColorFactory;
import acan.creational.ab.factory.manager.factory.ShapeFactory;

/**
 * @author acan
 * @version 2022/12/12 03:25
 */
public class FactoryContext {

    public static AbstractFactory getFactory(String factoryType) {
        return switch (factoryType.toLowerCase()) {
            default -> null;
            case "color" -> new ColorFactory();
            case "shape" -> new ShapeFactory();
        };
    }
}
