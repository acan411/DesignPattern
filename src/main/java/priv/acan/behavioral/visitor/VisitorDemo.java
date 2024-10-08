package priv.acan.behavioral.visitor;

import priv.acan.behavioral.visitor.intf.collective.impl.ComputerPartDisplayVisitor;
import priv.acan.behavioral.visitor.intf.part.ComputerPart;
import priv.acan.behavioral.visitor.intf.part.impl.Computer;

/**
 * @author acan
 * @since 2023/03/03 21:38
 */
public class VisitorDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
