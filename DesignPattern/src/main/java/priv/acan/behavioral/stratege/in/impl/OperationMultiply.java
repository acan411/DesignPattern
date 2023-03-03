package priv.acan.behavioral.stratege.in.impl;

import priv.acan.behavioral.stratege.in.Strategy;

/**
 * @author acan
 * @version 2023/03/03 20:49
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
