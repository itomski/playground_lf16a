package de.gfn.playground.uebungen.logger;

public class LoggerTest {

    public static void main(String[] args) {

        CustomLogger.debug(LoggerTest.class, "main", "Dies und das...");
        doSomething();

        new LoggerTest().doSomethingElse();

        CustomLogger.print();
    }

    public static void doSomething() {
        CustomLogger.debug(LoggerTest.class, "doSomething", "Was anderes...");
    }

    public void doSomethingElse() {
        CustomLogger.error(LoggerTest.class, "doSomethingElse", "Problem...");
    }
}
