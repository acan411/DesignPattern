package priv.acan.behavioral.chain.ab.impl;

import priv.acan.behavioral.chain.ab.AbstractLogger;

/**
 * @author acan
 * @version 2022/12/18 18:25
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("InfoLogger::write() " + message);
    }
}
