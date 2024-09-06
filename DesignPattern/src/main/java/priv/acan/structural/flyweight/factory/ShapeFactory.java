package priv.acan.structural.flyweight.factory;

import priv.acan.structural.flyweight.in.Shape;
import priv.acan.structural.flyweight.in.impl.Circle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acan
 * @since 2022/12/17 23:36
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {

        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
