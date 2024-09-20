package priv.acan.structural.flyweight;

import priv.acan.structural.flyweight.constant.Color;
import priv.acan.structural.flyweight.factory.CircleFactory;
import priv.acan.structural.flyweight.intf.impl.Circle;

/**
 * @author acan
 * @since 2022/12/17 23:40
 */
public class FlyweightDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(getRandom());
            circle.draw();
        }
    }

    private static Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandom() {
        return (int) (Math.random() * 100);
    }

}
