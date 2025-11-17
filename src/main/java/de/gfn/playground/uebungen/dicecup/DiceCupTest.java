package de.gfn.playground.uebungen.dicecup;

import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        /*
        // Statische Variante
        System.out.println(DiceCup.roll());
        int[] res = DiceCup.roll(100);
        System.out.println(Arrays.toString(res));
        System.out.println();
        DiceCup.analyse(res);
        */

        DiceCup w6 = new DiceCup();
        System.out.println(w6.roll());
        int[] res = w6.roll(10);
        System.out.println(Arrays.toString(res));
        System.out.println();
        w6.analyse(res);

        System.out.println();

        DiceCup w10 = new DiceCup(10);
        System.out.println(w10.roll());
        res = w10.roll(10);
        System.out.println(Arrays.toString(res));
        System.out.println();
        w10.analyse(res);

        System.out.println();

        DiceCup w100 = new DiceCup(100);
        System.out.println(w100.roll());
        res = w100.roll(10);
        System.out.println(Arrays.toString(res));
        System.out.println();
        w100.analyse(res);

        System.out.println();

        DiceCup w = new DiceCup(Dice.W6);
        System.out.println(w.roll());
        res = w.roll(10);
        System.out.println(Arrays.toString(res));
        System.out.println();
        w.analyse(res);
    }

}
