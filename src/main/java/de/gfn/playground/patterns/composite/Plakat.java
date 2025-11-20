package de.gfn.playground.patterns.composite;

public class Plakat implements Dokument {

    private String motiv;
    private String text;

    public Plakat(String motiv, String text) {
        this.motiv = motiv;
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Plakat: " + motiv + " / " + text + " - wird geprintet");
    }
}
