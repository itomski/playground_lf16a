package de.gfn.playground.uebungen.dicecup;

import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        System.out.println(DiceCup.roll());

        int[] res = DiceCup.roll(100);
        System.out.println(Arrays.toString(res));

        System.out.println();

        DiceCup.analyse(res);
    }

}
