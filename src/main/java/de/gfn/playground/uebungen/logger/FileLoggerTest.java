package de.gfn.playground.uebungen.logger;

public class FileLoggerTest {

    public static void main(String[] args) {

        var logger = FileLogger.getInstance();
        //logger.debug(FileLoggerTest.class, "main", "Dies und das...");
        //doSomething();
        //new FileLoggerTest().doSomethingElse();
        logger.print();
    }

    public static void doSomething() {
        FileLogger.getInstance().debug(FileLoggerTest.class, "doSomething", "Was anderes...");
    }

    public void doSomethingElse() {
        FileLogger.getInstance().error(FileLoggerTest.class, "doSomethingElse", "Problem...");
    }
}
