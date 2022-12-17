package priv.acan.bridge.ab.impl;

import priv.acan.bridge.ab.Shape;
import priv.acan.bridge.in.DrawApi;

/**
 * @author acan
 * @version 2022/12/17 13:18
 */
public class Square extends Shape {

    private final int width;

    private final int height;

    private final int x;

    private final int y;

    public Square(DrawApi drawApi, int width, int height, int x, int y) {
        super(drawApi);
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawSquare(width, height, x, y);
    }
}
