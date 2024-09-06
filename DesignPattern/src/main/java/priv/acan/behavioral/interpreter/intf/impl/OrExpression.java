package priv.acan.behavioral.interpreter.intf.impl;

import lombok.AllArgsConstructor;
import priv.acan.behavioral.interpreter.intf.Expression;

/**
 * @author acan
 * @since 2022/12/21 23:29
 */
@AllArgsConstructor
public class OrExpression implements Expression {

    private final Expression expr1;
    private final Expression expr2;

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
