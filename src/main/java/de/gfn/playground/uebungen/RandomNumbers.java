package de.gfn.playground.uebungen;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    private static Scanner scanner = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        int[] zahlen = new int[10];

        app: while(true) {
            arrayMitZahlenBelegen(zahlen);

            System.out.print("Noch ein Spiel? ");
            if(!scanner.nextLine().trim().toLowerCase().equals("ja")) {
                break app;
            }
        }
    }

    private static void arrayMitZahlenBelegen(int[] zahlen) {
        for (int i = 0; i < zahlen.length ; i++) {
            zahlen[i] = rand.nextInt(6) + 1;
        }
    }
}
