package priv.acan.behavioral.stratege.context;

import priv.acan.behavioral.stratege.in.Strategy;

/**
 * @author acan
 * @version 2023/03/03 20:50
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
