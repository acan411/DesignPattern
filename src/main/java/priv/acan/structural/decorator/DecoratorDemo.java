package priv.acan.structural.decorator;

import priv.acan.structural.decorator.abst.ShapeDecorator;
import priv.acan.structural.decorator.abst.impl.RedShapeDecorator;
import priv.acan.structural.decorator.intf.impl.Circle;
import priv.acan.structural.decorator.intf.impl.Rectangle;

/**
 * @author acan
 * @since 2022/12/17 15:30
 */
public class DecoratorDemo {

    public static void main(String[] args) {

        Circle circle = new Circle();

        ShapeDecorator redBorderCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redBorderRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println();

        System.out.println("Circle of red border");
        redBorderCircle.draw();

        System.out.println();

        System.out.println("Rectangle of red border");
        redBorderRectangle.draw();
    }
}
