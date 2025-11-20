package de.gfn.playground.patterns.composite;

public class Printer {

    /*
    // Enge Kopplung
    public void printDocument(Buch b) {
        b.print();
    }

    public void printDocument(Seite s) {
        s.print();
    }
    */

    // Lose Kopplung
    // Der übergebene Parameter muss ein Objekt sein, das die Anforderungen aus dem Interface erfüllt
    public void printDocument(Dokument d) { // Parametertyp ist ein Interface
        d.print(); // Alle Dokumente haben eine print-Methode
    }
}
