package priv.acan.behavioral.visitor.in.collective.impl;

import priv.acan.behavioral.visitor.in.collective.ComputerPartVisitor;
import priv.acan.behavioral.visitor.in.part.impl.Computer;
import priv.acan.behavioral.visitor.in.part.impl.Keyboard;
import priv.acan.behavioral.visitor.in.part.impl.Monitor;
import priv.acan.behavioral.visitor.in.part.impl.Mouse;

/**
 * @author acan
 * @version 2023/03/03 21:37
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
