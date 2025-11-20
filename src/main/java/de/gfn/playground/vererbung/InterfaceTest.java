package de.gfn.playground.vererbung;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InterfaceTest {

    public static void main(String[] args) {

        // Interfaces können als Referenztyp genutzt werden
        // Sind NICHT instanzierbar
        List<Medium> medien1 = new ArrayList<>();
        medien1.add(new Buch());
        medien1.add(new Film());
        medien1.add(new Memo()); // Add nimmt nur Objekte an, die das Interface implementieren
        for(Medium m : medien1) {
            System.out.println(m.getContent());
            System.out.println(m.getSize());
            System.out.println(m);
        }

        //List<Object> medien2 = new ArrayList<>();
        List<Object> medien2 = new LinkedList<>(); // List<...> = Objekttyp muss das List-Interface implementieren
        medien2.add(new Buch());
        medien2.add(new Film());
        medien2.add(new Memo());
        medien2.add(123);
        medien2.add("Hallo");
        for(Object o : medien2) {
            System.out.println(o); // Besondere Fähigkeiten der Objekte sind über die Referenz o nicht nutzbar!
        }

        System.out.println();

        Printer canon = new Printer();
        canon.addJob(new Buch());
        canon.addJob(new Buch());
        canon.addJob(new Memo());
        canon.addJob(new Film());
        canon.doJobs();
    }
}

class Printer {

    // Queue ist eine Warteschlange
    Queue<Medium> jobs = new LinkedList<>();

    public void addJob(Medium m) {
        jobs.offer(m); // Gleich wie add aber ohne Exception
    }

    public void doJobs() {
        while(!jobs.isEmpty()) {
            // poll holt das nächste Element aus der Warteschlange raus
            Medium m = jobs.poll();
            m.print();
        }
    }
}


// Anforderungen für einen Informationsträger
interface Medium {

    // Attribute im Interface sind IMMER public static final
    // Interface hat nur public Methoden

    // Interfaces geben vor WAS eingebaut werden soll, aber nicht WIE es eingebaut werden soll

    public String getContent(); // Methode ist abstrakt = wird nicht ausprogrammiert

    public int getSize();

    public void print();

}

class Buch implements Medium {

    // implement = Methoden des Interface MÜSSEN eingebaut werden

    @Override
    public String getContent() {
        return "";
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("BUCH");
    }

}

class Memo implements Medium {

    @Override
    public String getContent() {
        return "";
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("MEMO");
    }
}

class Film implements Medium {

    @Override
    public String getContent() {
        return "";
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("FILM: Kann nicht gedruckt werden");
    }
}