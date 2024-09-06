package priv.acan.structural.bridge.ab;

import priv.acan.structural.bridge.in.DrawApi;

/**
 * @author acan
 * @since 2022/12/16 23:47
 */
public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
