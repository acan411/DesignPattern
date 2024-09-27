package priv.acan.behavioral.interpreter.intf;

/**
 * @author acan
 * @since 2022/12/21 23:21
 */
public interface Expression {

    boolean interpret(String context);
}