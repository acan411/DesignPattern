package priv.acan.behavioral.visitor.intf.part.impl;

import priv.acan.behavioral.visitor.intf.collective.ComputerPartVisitor;
import priv.acan.behavioral.visitor.intf.part.ComputerPart;

/**
 * @author acan
 * @since 2023/03/03 21:31
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
