package priv.acan.creational.abst.factory.manager;

import priv.acan.creational.abst.factory.abst.AbstractFactory;
import priv.acan.creational.abst.factory.abst.impl.ColorFactory;
import priv.acan.creational.abst.factory.abst.impl.ShapeFactory;

/**
 * @author acan
 * @since 2022/12/12 03:25
 */
public class FactoryContext {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        return switch (factoryType) {
            case COLOR -> new ColorFactory();
            case SHAPE -> new ShapeFactory();
        };
    }
}
