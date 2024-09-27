package priv.acan.behavioral.visitor.intf.part;

import priv.acan.behavioral.visitor.intf.collective.ComputerPartVisitor;

/**
 * @author acan
 * @since 2023/03/03 21:27
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
