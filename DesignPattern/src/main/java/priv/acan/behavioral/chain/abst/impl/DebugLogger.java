package priv.acan.behavioral.chain.abst.impl;

import priv.acan.behavioral.chain.abst.AbstractLogger;

/**
 * @author acan
 * @since 2022/12/18 18:28
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
