package de.gfn.playground.patterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Printer printer = new Printer();

        Buch b1 = new Buch("Neuromancer");
        printer.printDocument(b1);

        Buch b2 = new Buch("Mona Lisa Overdrive");
        printer.printDocument(b2);

        Seite s1 = new Seite("Das ist das Haus von Nikigraus...");
        printer.printDocument(s1);

        Plakat p1 = new Plakat("Regenwald", "Junggle-Time! Now!");
        printer.printDocument(p1);

        System.out.println();
        // Composite: Gruppe von Objejkten kann gleich wie ein einziges verarbeitet werden

        s1 = new Seite("Seite 1: ...");
        Seite s2 = new Seite("Seite 2: ...");
        Seite s3 = new Seite("Seite 3: ...");

        DokumentGruppe gruppe = new DokumentGruppe(s1, s2, s3, b1);
        printer.printDocument(gruppe);
    }
}
