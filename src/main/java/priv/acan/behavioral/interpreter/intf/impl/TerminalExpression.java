package priv.acan.behavioral.interpreter.intf.impl;

import lombok.AllArgsConstructor;
import priv.acan.behavioral.interpreter.intf.Expression;

/**
 * @author acan
 * @since 2022/12/21 23:26
 */
@AllArgsConstructor
public class TerminalExpression implements Expression {

    private final String data;

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
