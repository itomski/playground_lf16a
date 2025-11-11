package de.gfn.playground.arrays;

import java.util.Arrays;

public class Array2DTest {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2},{3,4,7,9},{4},{6,7,8},{8,9}
        };

        Arrays.stream(arr).forEach(a -> System.out.println(Arrays.toString(a)));
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(Arrays.deepToString(arr));
        System.out.println();

        System.out.println((int)' ');
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] zeile : arr) {
            for(int wert : zeile) {
                System.out.print(wert + " ");
            }
            System.out.println();
        }

        int a, b, c; // Alle Variablen werden als int-Variablen deklariert
        int d = 22, e = 7, f = 10;

        int[] arr2;
        int arr3[];
        int[] arr4[]; // 2d Array
        int[] a1, a2[], a3; // a1 und a3 sind int-Arrays. a2 ist ein 2d-int-Array

        byte[][] byteArr1 = new byte[5][5]; // 5 Zeilen und 5 Zellen pro Zeile (25 Werte)
        System.out.println(Arrays.deepToString(byteArr1));
        byte[][] byteArr2 = new byte[5][]; // 5 Zeilen aber noch keine Zellen
        byteArr2[0] = new byte[]{7,3,22,18};
        byteArr2[1] = new byte[]{78};
        System.out.println(Arrays.deepToString(byteArr2));
    }
}
