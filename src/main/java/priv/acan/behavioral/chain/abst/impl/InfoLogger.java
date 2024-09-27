package priv.acan.behavioral.chain.abst.impl;

import priv.acan.behavioral.chain.abst.AbstractLogger;

/**
 * @author acan
 * @since 2022/12/18 18:25
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("InfoLogger::write " + message);
    }
}
