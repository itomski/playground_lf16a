package de.gfn.playground.basics;

import java.time.LocalDateTime;

public class StackTest {

    private static final boolean PRINT_LOG = false;

    public static void main(String[] args) {
        new StackTest().start();
        log("Ende Main");
    }

    private void start() {
        methodA();
        log("Ende Start");
    }

    private void methodA() {
        methodB();
        log("Ende A");
    }

    private void methodB() {
        methodC();
        log("Ende B");
    }

    private void methodC() {
        log("Meine Nachricht");
        log("Ende C");
    }

    private static void log(String msg) {
        if(PRINT_LOG) {
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();
            StackTraceElement element = stack[2];
            System.out.println(LocalDateTime.now() + ": " + element.getClassName() + "/" + element.getMethodName() + " - " + msg + ", Zeile: " + element.getLineNumber());
        }
    }
}
