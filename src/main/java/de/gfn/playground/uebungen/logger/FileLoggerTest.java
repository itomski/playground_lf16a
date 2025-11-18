package de.gfn.playground.uebungen.logger;

public class FileLoggerTest {

    public static void main(String[] args) {

        var logger = FileLogger.getInstance();
        logger.debug("Dies und das...");
        doSomething();
        new FileLoggerTest().doSomethingElse();
        logger.print();
    }

    public static void doSomething() {
        FileLogger.getInstance().debug("Was anderes...");
    }

    public void doSomethingElse() {
        FileLogger.getInstance().error("FileLoggerTest", "doSomethingElse", "Problem...");
    }
}
