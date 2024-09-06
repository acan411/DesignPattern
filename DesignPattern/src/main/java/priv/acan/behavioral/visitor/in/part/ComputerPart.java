package priv.acan.behavioral.visitor.in.part;

import priv.acan.behavioral.visitor.in.collective.ComputerPartVisitor;

/**
 * @author acan
 * @since 2023/03/03 21:27
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
