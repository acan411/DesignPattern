package priv.acan.structural.flyweight.intf.impl;

import lombok.Builder;
import lombok.Setter;
import priv.acan.structural.flyweight.constant.Color;
import priv.acan.structural.flyweight.intf.Shape;

/**
 * @author acan
 * @since 2022/12/17 23:33
 */
@Builder
public class Circle implements Shape {

    private final Color color;

    @Setter
    private int x;

    @Setter
    private int y;

    @Setter
    private int radius;

    @Override
    public void draw() {
        System.out.println("Circle: Draw [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
