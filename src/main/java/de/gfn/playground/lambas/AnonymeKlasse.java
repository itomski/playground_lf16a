package de.gfn.playground.lambas;

import java.util.Comparator;

public class AnonymeKlasse {

    public static void main(String[] args) {

        // Einwegklassen - hat keinen Namen und basiert auf einer Klasse oder einem Interface
        // Es wird sofort eine Instanz erzeugt
        // Es können keine weiteren Instanzen aus dieser Klassen entstehen
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //...
                return 0;
            }
        };

        Machbar m1 = new Machbar() {
            @Override
            public void machDenJob() {
                System.out.println("Ich mache den Job");
            }

            @Override
            public int machEinenAnderenJob(int zahl) {
                System.out.println("Ich mache den anderen Job!");
                return zahl * zahl;
            }
        };

        // Die Anonyme Klasse erbt vom Interface und überschreibt die Methoden
        Machbar m2 = new Machbar() {
            @Override
            public void machDenJob() {
                System.out.println("Bla bla bla");
            }

            @Override
            public int machEinenAnderenJob(int zahl) {
                System.out.println("Ich mache da nix...");
                return zahl * 2;
            }
        };

        m1.machDenJob();
        m1.machEinenAnderenJob(10);

        System.out.println();

        m2.machDenJob();
        m2.machEinenAnderenJob(10);

    }
}

interface Machbar {

    void machDenJob();

    int machEinenAnderenJob(int zahl);
}
