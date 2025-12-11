package de.gfn.playground.threads;

public class ThreadTest1 {

    public static void main(String[] args) {

        var name = Thread.currentThread().getName();

        System.out.println(name + ": START");

        // void run();
        Runnable aufgabe = () -> {
            var threadName = Thread.currentThread().getName();
            for (int i = 0; i < 10_000; i++) {
                System.out.println(threadName + ": " + i);
            }
        };

        // Aufgabe wird dem Thread als Runnable über den Konstruktor zugewiesen
        new Thread(aufgabe).start();
        new Thread(aufgabe).start();

        Thread t4 = new Thread(aufgabe);
        t4.start();
        //t4.start();

        // Aufgabe ist bereits im Thread enthalten
        new Aufgabe().start();
        new Aufgabe().start();

        // Aufgabe ist als Objekt einer Klasse, die Runnable implementiert verpackt
        new Thread(new Zaehler()).start();

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
        }

        System.out.println(name + ": ENDE");
    }
}

class Aufgabe extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

class Zaehler implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

