package priv.acan.structural.bridge;

import priv.acan.structural.bridge.abst.DrawShape;
import priv.acan.structural.bridge.abst.impl.DrawBridge;
import priv.acan.structural.bridge.intf.impl.DrawGreen;
import priv.acan.structural.bridge.intf.impl.DrawRed;
import priv.acan.structural.bridge.model.Circle;

/**
 * @author acan
 * @since 2022/12/16 23:52
 */
public class BridgeDemo {

    public static void main(String[] args) {

        DrawShape redCircle = new DrawBridge(new DrawRed(), new Circle(6, 6, 6));
        DrawShape greenCircle = new DrawBridge(new DrawGreen(), new Circle(5, 5, 5));

        redCircle.draw();
        greenCircle.draw();
    }
}
