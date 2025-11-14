package de.gfn.playground.uebungen.dicecup;

import java.util.Random;

public class DiceCup {

    private static final Random rand = new Random();

    private DiceCup() {
    }

    public static int roll() {
        return rand.nextInt(6) + 1;
    }

    public static int[] roll(int num) {
        int[] results = new int[num];
        for (int i = 0; i < results.length; i++) {
            results[i] = roll();
        }
        return results;
    }

    public static void analyse(int[] results) {

        int[] counter = new int[6];
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
