package priv.acan.behavioral.chain.ab.impl;

import priv.acan.behavioral.chain.ab.AbstractLogger;

/**
 * @author acan
 * @version 2022/12/18 18:26
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger::write() " + message);
    }
}
