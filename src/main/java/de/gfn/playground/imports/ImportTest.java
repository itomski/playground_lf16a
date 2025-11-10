package de.gfn.playground.imports;

import static java.lang.Math.*; // Importiert alle statischen Methoden und Attribute von Math
import static de.gfn.playground.imports.Status.*;

public class ImportTest {

    public static void main(String[] args) {

        //Math.pow(Math.PI * 10, 5);
        pow(PI * 10, 5);

        // Math m = new Math(); // Hat einen privaten Konstruktor

        // Enthält eine Klasse nur Klassenmethoden und Klassenattribute (static) ist es eine Utility-Klasse
        // und sollte einen privaten Konstruktor bekommen

        // Statisches Inventar (d.h. Klasseninventar) kann importiert werden

        Status s1 = Status.GEBLOCKT;
        Status s2 = GEBLOCKT; // Möglich, da Inhalt von Status mit static Import verfügbar ist

    }
}
