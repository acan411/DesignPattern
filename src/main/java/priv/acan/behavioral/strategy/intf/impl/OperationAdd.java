package priv.acan.behavioral.strategy.intf.impl;

import priv.acan.behavioral.strategy.intf.Strategy;

/**
 * @author acan
 * @since 2023/03/03 20:48
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
