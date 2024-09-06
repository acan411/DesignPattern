package priv.acan.structural.bridge.ab.impl;

import priv.acan.structural.bridge.ab.Shape;
import priv.acan.structural.bridge.in.DrawApi;

/**
 * @author acan
 * @since 2022/12/16 23:49
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
        drawApi.drawCircle(radius, x, y);
    }
}
