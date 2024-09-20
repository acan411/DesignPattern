package priv.acan.structural.flyweight.factory;

import priv.acan.structural.flyweight.constant.Color;
import priv.acan.structural.flyweight.intf.Shape;
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
        Circle circle = CIRCLE_MAP.getOrDefault(color, Circle.builder().color(color).build());
        CIRCLE_MAP.putIfAbsent(color, circle);
        return circle;
    }
}
