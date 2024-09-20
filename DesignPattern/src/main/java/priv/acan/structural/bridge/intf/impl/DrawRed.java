package priv.acan.structural.bridge.intf.impl;

import priv.acan.structural.bridge.intf.DrawApi;
import priv.acan.structural.bridge.model.Circle;

/**
 * @author acan
 * @since 2022/12/16 23:44
 */
public class DrawRed implements DrawApi {

    @Override
    public void drawCircle(Circle circle) {
        System.out.println("draw a red circle " + circle.getRadius() + " " + circle.getX() + " " + circle.getY());
    }
}
