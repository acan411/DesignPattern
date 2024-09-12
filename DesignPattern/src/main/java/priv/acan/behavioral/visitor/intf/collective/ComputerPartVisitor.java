package priv.acan.behavioral.visitor.intf.collective;

import priv.acan.behavioral.visitor.intf.part.impl.Computer;
import priv.acan.behavioral.visitor.intf.part.impl.Keyboard;
import priv.acan.behavioral.visitor.intf.part.impl.Monitor;
import priv.acan.behavioral.visitor.intf.part.impl.Mouse;


/**
 * @author acan
 * @since 2023/03/03 21:28
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
