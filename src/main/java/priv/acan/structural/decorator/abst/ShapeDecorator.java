package priv.acan.structural.decorator.abst;

import lombok.AllArgsConstructor;
import priv.acan.structural.decorator.intf.Shape;

/**
 * @author acan
 * @since 2022/12/17 15:27
 */
@AllArgsConstructor
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
