package de.gfn.playground.uebungen.dicecup;

import java.util.Random;

public class DiceCup {

    private static final Random rand = new Random();

    private static int PIPS;

    public DiceCup() {
        PIPS = 6;
    }

    public DiceCup(int pips) {
        PIPS = pips;
    }

    public DiceCup(Dice dice) {
        // TODO: Nur W4, W6, W10, W20, W100 zulassen
        PIPS = 6;
    }

    public int roll() {
        return rand.nextInt(PIPS) + 1;
    }

    public int[] roll(int num) {
        int[] results = new int[num];
        for (int i = 0; i < results.length; i++) {
            results[i] = roll();
        }
        return results;
    }

    public void analyse(int[] results) {

        int[] counter = new int[PIPS];
        for(int res : results) {
            counter[res - 1]++;
        }
        printAnalysis(counter);
    }

    private static void printAnalysis(int[] counter) {
        for(int i = 0; i < counter.length; i++) {
            System.out.println((i + 1) + ":" + counter[i]);
        }
    }
}
