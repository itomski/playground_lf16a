package de.gfn.playground.patterns.composite;

public class Seite implements Dokument {

    private String inhalt;

    public Seite(String inhalt) {
        this.inhalt = inhalt;
    }

    public void print() {
        System.out.println("Seite: " + inhalt + " \nWird geprintet!");
    }
}
