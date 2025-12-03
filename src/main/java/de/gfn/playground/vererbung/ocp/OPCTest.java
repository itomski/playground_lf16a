package de.gfn.playground.vererbung.ocp;

public class OPCTest {

    public static void main(String[] args) {

        Thing t = new Thing("Bla bla bla");
        Client c = new Client();
        c.compute(t);

        System.out.println();

        t = new NextThing();
        c.compute(t);
    }
}

class Client {

    public void compute(Thing thing) {
        System.out.println("Client: compute...");
        thing.run();
    }
}

class Thing {

    protected String content;

    public Thing(String content) {
        this.content = content;
    }

    public void run() {
        System.out.println(getClass().getSimpleName() + ": run... " + content);
    }
}

class NextThing extends Thing {

    public NextThing() {
        super("Dies und das... ");
    }

    @Override
    public void run() {
        super.run(); // Aufruf der run-Methode der Elternklasse
        System.out.println("Anderes Verhalten... " + content);
    }

    public void runNext() {
        System.out.println("Ganz anderes Verhalten... " + content);
    }
}
