package de.gfn.playground.uebungen.pilzsuche;

import java.util.Random;
import java.util.Scanner;

public class Pilzsuche {

    private Scanner scanner = new Scanner(System.in);
    private Random rand = new Random();

    private final int zeilen;
    private final int spalten;

    private char[][] spielfeld;
    private char[][] ausgabe;

    public Pilzsuche() {
        this(10, 10); // Aufruf des anderen Konstruktors
    }

    public Pilzsuche(int zeilen, int spalten) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        spielfeld = new char[zeilen][spalten];
        ausgabe = new char[zeilen][spalten];
    }

    public void start() {
    }
}
