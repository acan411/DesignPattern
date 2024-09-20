package priv.acan.structural.flyweight.factory;

import priv.acan.structural.flyweight.constant.Color;
import priv.acan.structural.flyweight.intf.impl.Circle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acan
 * @since 2022/12/17 23:36
 */
public class CircleFactory {

    private CircleFactory() {
    }

    private static final Map<Color, Circle> CIRCLE_MAP = new HashMap<>();

    public static Circle getCircle(Color color) {
        if (!CIRCLE_MAP.containsKey(color)) {
            CIRCLE_MAP.put(color, Circle.builder().color(color).build());
            System.out.println("Creating circle of color : " + color);
        }
        return CIRCLE_MAP.get(color);
    }
}
