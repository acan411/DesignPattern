package priv.acan.behavioral.interpreter.in;

/**
 * @author acan
 * @version 2022/12/21 23:21
 */
public interface Expression {

    boolean interpret(String context);
}