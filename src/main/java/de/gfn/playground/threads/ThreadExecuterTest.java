package de.gfn.playground.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecuterTest {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);

        Runnable aufgabe = () -> {
            var threadName = Thread.currentThread().getName();
            for (int i = 0; i < 100; i++) {
                System.out.println(threadName + ": " + i);
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        service.execute(aufgabe);
        service.execute(aufgabe);
        service.execute(aufgabe);
        service.execute(aufgabe);

        service.shutdown();
    }
}
