package priv.acan.behavioral.chain;

import priv.acan.behavioral.chain.ab.AbstractLogger;
import priv.acan.behavioral.chain.ab.impl.DebugLogger;
import priv.acan.behavioral.chain.ab.impl.ErrorLogger;
import priv.acan.behavioral.chain.ab.impl.InfoLogger;

/**
 * @author acan
 * @version 2022/12/18 18:29
 */
public class ChainDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an info level information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error level information.");
    }
}
