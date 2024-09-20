package priv.acan.behavioral.chain.abst.impl;

import priv.acan.behavioral.chain.abst.AbstractLogger;

/**
 * @author acan
 * @since 2022/12/18 18:26
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger::write " + message);
    }
}
