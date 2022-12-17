package priv.acan.structural.facade.manager;

import priv.acan.structural.facade.in.Shape;
import priv.acan.structural.facade.in.impl.Circle;
import priv.acan.structural.facade.in.impl.Rectangle;
import priv.acan.structural.facade.in.impl.Square;

/**
 * @author acan
 * @version 2022/12/17 23:28
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
