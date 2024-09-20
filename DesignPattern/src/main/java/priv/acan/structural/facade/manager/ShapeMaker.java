package priv.acan.structural.facade.manager;

import priv.acan.structural.facade.intf.Shape;
import priv.acan.structural.facade.intf.impl.Circle;
import priv.acan.structural.facade.intf.impl.Rectangle;
import priv.acan.structural.facade.intf.impl.Square;

/**
 * @author acan
 * @since 2022/12/17 23:28
 */
public class ShapeMaker {

    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
