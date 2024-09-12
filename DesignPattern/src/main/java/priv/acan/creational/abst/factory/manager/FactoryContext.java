package priv.acan.creational.abst.factory.manager;

import priv.acan.creational.abst.factory.manager.ab.AbstractFactory;
import priv.acan.creational.abst.factory.manager.factory.ColorFactory;
import priv.acan.creational.abst.factory.manager.factory.ShapeFactory;

/**
 * @author acan
 * @since 2022/12/12 03:25
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
