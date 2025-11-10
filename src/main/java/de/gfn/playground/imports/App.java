// Wenn keine Package-Anweisung vorhanden ist, liegt die Klasse im default-Package
package de.gfn.playground.imports;

//import java.util.Date;
//import java.sql.Date;
import java.io.BufferedReader;

// Jede klasse kann max. einem Package angehören
// Jede Klasse kann 0-n andere Klassen importieren
// Alle Klassen aus java.lang sind automatisch importiert

public class App {

    public static void main(String[] args) {

        java.util.Date d1 = new java.util.Date(2000, 10, 15);
        System.out.println(d1);

        java.sql.Date d2 = new java.sql.Date(System.currentTimeMillis());
        System.out.println(d2);

        //java.io.BufferedReader reader; // Ohne Import
        BufferedReader reader; // Wenn importiert Nutzung über den Klassennamen möglich

        // Alle Klassen, die nicht im aktuellen Package liegen
        // müssen importiert werden

        // Namenskonventionen

        // PascalCase: Klassennamen (Interfaces, Enums, Records, Annotations)
        // camelCase: Methoden und Attribute
        // snake_case: Wird in Java nicht verwendet
        // SCREAMING_SNAKE_CASE: öffentliche Konstanten
        // kebap-case: Wird in Java nicht verwendet
        // de.gfn.playground: Packages

        Wochentag t1 = Wochentag.FR; // Enum: Vorgegebene Optionen

        // out = Klassenattribut
        System.out.println("...");

        System.out.println(Math.PI);

        String s = "Hallo Welt"; // komplexer Typ = basiert auf einer Klasse
        Byte b1 = 10; // Wrappertypen = Klasse, die erweiterte Fähigkeiten für primitive Datentypen bereitstellt
        byte b2 = 10; // primitiver Typ (byte, short, int, long, float, double, char, boolean)

        // Unterschied zwischen Klassenmethoden und Instanzmethoden

        // Integer.toBinaryString = Klassenmethode
        System.out.println(Integer.toBinaryString(120));
        Integer i = 100;
        // Instanzmethode
        System.out.println(i.doubleValue());
    }
}

enum Wochentag {
    MO, DI, MI, DO, FR, SA, SO
}
