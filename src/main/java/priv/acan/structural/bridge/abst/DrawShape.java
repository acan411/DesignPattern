package priv.acan.structural.bridge.abst;

import priv.acan.structural.bridge.intf.DrawApi;

/**
 * @author acan
 * @since 2022/12/16 23:47
 */
public abstract class DrawShape {

    protected DrawApi drawApi;

    protected DrawShape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
