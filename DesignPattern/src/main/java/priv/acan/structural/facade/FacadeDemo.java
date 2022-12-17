package priv.acan.structural.facade;

import priv.acan.structural.facade.manager.ShapeMaker;

/**
 * @author acan
 * @version 2022/12/17 23:29
 */
public class FacadeDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
