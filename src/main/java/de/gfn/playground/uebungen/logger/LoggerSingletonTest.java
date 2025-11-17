package de.gfn.playground.uebungen.logger;

public class LoggerSingletonTest {

    public static void main(String[] args) {

        var logger = LoggerSingleton.getInstance();
        logger.debug(de.gfn.playground.uebungen.logger.LoggerTest.class, "main", "Dies und das...");
        doSomething();

        new LoggerSingletonTest().doSomethingElse();

        logger.print();
    }

    public static void doSomething() {
        LoggerSingleton.getInstance().debug(de.gfn.playground.uebungen.logger.LoggerTest.class, "doSomething", "Was anderes...");
    }

    public void doSomethingElse() {
        LoggerSingleton.getInstance().error(de.gfn.playground.uebungen.logger.LoggerTest.class, "doSomethingElse", "Problem...");
    }
}
