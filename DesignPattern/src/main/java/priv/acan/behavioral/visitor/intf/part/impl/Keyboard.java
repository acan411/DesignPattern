package priv.acan.behavioral.visitor.intf.part.impl;

import lombok.Data;
import priv.acan.behavioral.visitor.intf.collective.ComputerPartVisitor;
import priv.acan.behavioral.visitor.intf.part.ComputerPart;

/**
 * @author acan
 * @since 2023/03/03 21:30
 */
@Data
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
