package priv.acan.bridge;

import priv.acan.bridge.ab.Shape;
import priv.acan.bridge.ab.impl.Circle;
import priv.acan.bridge.ab.impl.Square;
import priv.acan.bridge.in.impl.DrawCircle;
import priv.acan.bridge.in.impl.DrawSquare;

/**
 * @author acan
 * @version 2022/12/17 13:52
 */
public class BridgeDemo {

    public static void main(String[] args) {

        Shape square = new Square(new DrawSquare(), 50, 50, 0, 0);
        Shape circle = new Circle(new DrawCircle(), 100, 100, 100);

        square.draw();
        circle.draw();
    }
}
