package priv.acan.behavioral.interpreter;

import priv.acan.behavioral.interpreter.intf.Expression;
import priv.acan.behavioral.interpreter.intf.impl.AndExpression;
import priv.acan.behavioral.interpreter.intf.impl.OrExpression;
import priv.acan.behavioral.interpreter.intf.impl.TerminalExpression;

/**
 * @author acan
 * @since 2022/12/21 23:32
 */
public class InterpreterDemo {

    // 规则：Robert 和 John 是男性
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    // 规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
