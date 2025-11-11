package de.gfn.playground.arrays;

import java.util.Arrays;

public class ArraySuche {

    public static void main(String[] args) {

        int[] zahlen = {2,35,6,9,-10,18,100, 2099};
        Arrays.sort(zahlen);
        System.out.println(Arrays.toString(zahlen));
        // Wenn gefunden, dann wird die Index-Pos geliefert
        // Wenn NICHT gefunden, dann wird die Index-Pos geliefert an der es stehen sollte als minus Wert - 1
        int pos = Arrays.binarySearch(zahlen, 20);
        System.out.println(pos);


        int[] array1 = {2,7,9,0};
        int[] array2 = {2,7,9,0};
        int[] array3 = {2,7,9,0,22};
        System.out.println(array1.equals(array2)); // equals von array vergleich die Identität der Objekte
        System.out.println(Arrays.equals(array1, array2)); // Inhaltsvergleich
        System.out.println(Arrays.equals(array1, array3)); // Inhaltsvergleich
        System.out.println();

        // Wo liegt der Unterschied
        System.out.println(Arrays.mismatch(array1, array2)); // Kein Unterschied: -1
        System.out.println(Arrays.mismatch(array1, array3)); // Unterschied: 1 (Position im Index)

    }
}
