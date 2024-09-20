package priv.acan.structural.bridge.abst.impl;

import priv.acan.structural.bridge.abst.DrawShape;
import priv.acan.structural.bridge.intf.DrawApi;
import priv.acan.structural.bridge.model.Circle;

/**
 * @author acan
 * @since 2022/12/16 23:49
 */
public class DrawBridge extends DrawShape {

    private final Circle circle;

    public DrawBridge(DrawApi drawApi, Circle circle) {
        super(drawApi);
        this.circle = circle;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(circle);
    }
}
