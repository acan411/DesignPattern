package priv.acan.behavioral.chain.ab.impl;

import priv.acan.behavioral.chain.ab.AbstractLogger;

/**
 * @author acan
 * @version 2022/12/18 18:28
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DebugLogger::write() " + message);
    }
}
