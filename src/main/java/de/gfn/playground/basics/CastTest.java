package de.gfn.playground.basics;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CastTest {

    public static void main(String[] args) {

        byte b = 10;
        int i = b; // automatisches (implizit) primitive Widening Casting von byte zu int
        // b = i; // Error: automatisches primitive Narrowing ist nicht möglich
        b = (byte) i; // explizit / primitiv Narrowing wird erzwungen
        System.out.println(i);
        System.out.println(b);
        System.out.println();

        i = 200;
        b = (byte) i; // Überlauf
        System.out.println(i);
        System.out.println(b);
        System.out.println();

        i = -200;
        b = (byte) i; // Unterlauf
        System.out.println(i);
        System.out.println(b);
        System.out.println();

        // beim Erzwingen des Casts kann es zum Über- oder Unterlauf kommen

        // Automatisches Autoboxing
        Byte b2 = 10; // Literale im Wertebereich eines Bytes werden bei der Deklaration automatomatisch als Byte abgelegt
        Short s1 = 10; // Literale im Wertebereich eines Shorts werden bei der Deklaration automatomatisch als Short abgelegt

        //Long l = 100; // Error: Autoboxing (von int zu Integer) und dann komplex Widening (von Integer zu Long)
        Long l = (long)100; // Ok: primitive Widening (int zu long) und danach Autoboxing (long zu Long)

        byte b3 = 10;
        byte b4 = 7;
        int sum = b3 + b4; // Zum Rechnen werden die Datentypen mind. zu int angehoben
        long l2 = 200; // primitive Widening von int zu long
        l2 = 200l; // ohne primitive Widening
        long sum2 = b3 + l2; // byte wird zu long angehoben - Erg. ist vom Typ long
        // Erg. ist immer vom Typ des größeren Operanden

        byte b5 = 10;
        b5 += 10; // b5 = (byte)(b5 + 10);
        b5++; // b5 = (byte)(b5 + 1);
        System.out.println(b5);
        b5 += 150;
        System.out.println(b5);

        System.out.println();

        int i6 = 'c'; // primitive Widening von char zu int
        long l3 = 'x'; // primitive Widening von char zu long
        System.out.println(i6);
        System.out.println(l3);
        System.out.println((char)i6);
        System.out.println((char)l3);



    }

}
