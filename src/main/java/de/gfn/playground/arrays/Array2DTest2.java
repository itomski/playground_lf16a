package de.gfn.playground.arrays;

import java.util.Arrays;

public class Array2DTest2 {

    public static void main(String[] args) {

        char[][] daten = new char[5][5];
        daten[1][3] = '@'; // Schreiben
        daten[2][4] = '#'; // Schreiben
        showArray(daten);
        System.out.println(daten[1][3]); // Lesen: 2 Zeile, 4 Spalte

        System.out.println();

        char[][] anderesArray = new char[5][5];
        anderesArray[1][3] = '@'; // Schreiben
        anderesArray[2][4] = '#'; // Schreiben
        showArray(anderesArray);

        boolean gleich = Arrays.deepEquals(daten, anderesArray);
        System.out.println(gleich);

        // Array vergrößern
        int[] zahlen = {2,3,4,5,6,7,8};
        //zahlen[7] = 9; // Exception: Array zu klein
        //zahlen =  Arrays.copyOf(zahlen, 10); // Neues größeres Array wird erzeugt und die alten Wert eingefügt
        zahlen =  Arrays.copyOfRange(zahlen, 1, 20);
        zahlen[7] = 9;
        System.out.println(Arrays.toString(zahlen));
    }

    private static void showArray(char[][] daten) {
        for(char[] row : daten) {
            for(char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
