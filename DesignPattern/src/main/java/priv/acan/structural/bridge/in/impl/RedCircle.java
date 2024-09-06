package priv.acan.structural.bridge.in.impl;

import priv.acan.structural.bridge.in.DrawApi;

/**
 * @author acan
 * @since 2022/12/16 23:44
 */
public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("RedCircle::drawCircle() " + radius + " " + x + " " + y);
    }
}
