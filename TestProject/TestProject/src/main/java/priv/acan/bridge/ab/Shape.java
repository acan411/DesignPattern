package priv.acan.bridge.ab;

import priv.acan.bridge.in.DrawApi;

/**
 * @author acan
 * @version 2022/12/17 13:00
 */
public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
