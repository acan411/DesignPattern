package priv.acan.structural.bridge.in.impl;

import priv.acan.structural.bridge.in.DrawApi;

/**
 * @author acan
 * @since 2022/12/16 23:46
 */
public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("GreenCircle::drawCircle() " + radius + " " + x + " " + y);
    }
}
