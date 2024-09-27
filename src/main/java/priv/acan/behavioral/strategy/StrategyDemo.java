package priv.acan.behavioral.strategy;

import priv.acan.behavioral.strategy.context.Context;
import priv.acan.behavioral.strategy.intf.impl.OperationAdd;
import priv.acan.behavioral.strategy.intf.impl.OperationMultiply;
import priv.acan.behavioral.strategy.intf.impl.OperationSubtract;

/**
 * @author acan
 * @since 2023/03/03 20:50
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
