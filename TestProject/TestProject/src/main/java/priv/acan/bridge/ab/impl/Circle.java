package priv.acan.bridge.ab.impl;

import priv.acan.bridge.ab.Shape;
import priv.acan.bridge.in.DrawApi;

/**
 * @author acan
 * @version 2022/12/17 13:18
 */
public class Circle extends Shape {

    private final int radius;

    private final int x;

    private final int y;

    public Circle(DrawApi drawApi, int radius, int x, int y) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }
}
