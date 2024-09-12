package priv.acan.behavioral.visitor.intf.part.impl;

import priv.acan.behavioral.visitor.intf.collective.ComputerPartVisitor;
import priv.acan.behavioral.visitor.intf.part.ComputerPart;

/**
 * @author acan
 * @since 2023/03/03 21:33
 */
public class Computer implements ComputerPart {

    private final ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
