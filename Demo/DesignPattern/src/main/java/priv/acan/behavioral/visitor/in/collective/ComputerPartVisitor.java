package priv.acan.behavioral.visitor.in.collective;

import priv.acan.behavioral.visitor.in.part.impl.Computer;
import priv.acan.behavioral.visitor.in.part.impl.Keyboard;
import priv.acan.behavioral.visitor.in.part.impl.Monitor;
import priv.acan.behavioral.visitor.in.part.impl.Mouse;


/**
 * @author acan
 * @version 2023/03/03 21:28
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
