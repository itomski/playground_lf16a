package de.gfn.playground.time;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class DateTest {

    public static void main(String[] args) {

        // Viele der Konstruktoren und Methoden von Date sind deprecated
        Date d1 = new Date();
        System.out.println(d1);

        d1 = new Date(2025, 11, 19);
        System.out.println(d1);

        long tstamp = System.currentTimeMillis();
        System.out.println(tstamp);
        d1 = new Date(tstamp);
        System.out.println(d1);

        System.out.println();

        // Viele der Methoden von Date sind deprecated
        // Wird hauptsächlich bei der Kommunikation mit der Datenbank verwendet
        java.sql.Date d2 = new java.sql.Date(2025, 11, 19);
        d2 = new java.sql.Date(tstamp);
        System.out.println(d2);
        //System.out.println(d2.toInstant());

        System.out.println();

        // LocalDate ist der aktuelle Standard für Datumsangaben
        LocalDate ld1 = d2.toLocalDate();
        System.out.println(ld1);

        System.out.println();

        // Laufzeit-Messung
        long start = System.currentTimeMillis();

        Random rand = new Random();
        int[] arr = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            //System.out.println(rand.nextInt(10) + 1);
            arr[i] = rand.nextInt(10) + 1;
        }
        long ende = System.currentTimeMillis();

        System.out.println(ende - start + " ms");

    }
}
