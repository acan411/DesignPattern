package priv.acan.behavioral.stratege;

import priv.acan.behavioral.stratege.context.Context;
import priv.acan.behavioral.stratege.in.impl.OperationAdd;
import priv.acan.behavioral.stratege.in.impl.OperationMultiply;
import priv.acan.behavioral.stratege.in.impl.OperationSubtract;

/**
 * @author acan
 * @version 2023/03/03 20:50
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
