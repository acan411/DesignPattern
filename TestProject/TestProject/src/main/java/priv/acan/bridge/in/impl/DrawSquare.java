package priv.acan.bridge.in.impl;

import priv.acan.bridge.in.DrawApi;

/**
 * @author acan
 * @version 2022/12/17 13:48
 */
public class DrawSquare implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
    }

    @Override
    public void drawSquare(int width, int height, int x, int y) {
        System.out.println("DrawSquare::drawSquare() " + width + " " + height + " " + x + " " + y);
    }
}
