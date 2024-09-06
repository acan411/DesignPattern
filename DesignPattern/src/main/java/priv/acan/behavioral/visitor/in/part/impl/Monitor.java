package priv.acan.behavioral.visitor.in.part.impl;

import priv.acan.behavioral.visitor.in.collective.ComputerPartVisitor;
import priv.acan.behavioral.visitor.in.part.ComputerPart;

/**
 * @author acan
 * @since 2023/03/03 21:31
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
