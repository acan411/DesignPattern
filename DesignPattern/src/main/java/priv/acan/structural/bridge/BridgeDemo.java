package priv.acan.structural.bridge;

import priv.acan.structural.bridge.ab.Shape;
import priv.acan.structural.bridge.ab.impl.Circle;
import priv.acan.structural.bridge.in.impl.GreenCircle;
import priv.acan.structural.bridge.in.impl.RedCircle;

/**
 * @author acan
 * @version 2022/12/16 23:52
 */
public class BridgeDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(new RedCircle(), 100, 0, 0);
        Shape greenCircle = new Circle(new GreenCircle(),50,1,1);

        redCircle.draw();
        greenCircle.draw();
    }
}
