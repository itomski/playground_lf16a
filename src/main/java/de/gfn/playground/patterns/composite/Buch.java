package de.gfn.playground.patterns.composite;

public class Buch implements Dokument {

    private String titel;

    public Buch(String titel) {
        this.titel = titel;
    }

    public void print() {
        System.out.println(titel + " (Buch): wird geprintet!");
    }
}
