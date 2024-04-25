package priv.acan.behavioral.interpreter.in.impl;

import lombok.AllArgsConstructor;
import priv.acan.behavioral.interpreter.in.Expression;

/**
 * @author acan
 * @version 2022/12/21 23:31
 */
@AllArgsConstructor
public class AndExpression implements Expression {

    private final Expression expr1;
    private final Expression expr2;

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
