package de.gfn.playground.arrays;

import java.util.Arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        // Array mit primitiven Typen
        int i = 10; // int
        int[] j = {5,7,9,22,8-5}; // int-Array
        double[] preise = {10.99, 2.50, 7.28}; // Diese Schreibweise möglich bei Instanzierung und Initialisierung
        boolean[] tests = {true, false, true};
        //preise = {10.85, 2.85, 7.85}; // Error: Da Variable bereits vorhanden ist, nicht erlaubt
        preise = new double[]{10.85, 2.85, 7.85}; // Ok

        // Array mit komplexen Typen
        String[] namen = {"Carol", "Scott", "Bruce", "Peter"};

        for (int k = 0; k < namen.length; k++) {
            System.out.print(namen[k] + ",");
        }

        System.out.println(); // Zeilenumbruch

        for(String name : namen) {
            System.out.print(name + ","); // Zeigt den aktuellen Wert
        }

        System.out.println(); // Zeilenumbruch

        // Ein Array kann seie Größe nachträglich NICHT verändern
        String[] andereNamen = new String[10]; // Array für Strings mit 10 freien Positionen
        andereNamen[9] = "Scott"; // Der Index im Array beginnt bei 0. Letzter Index = Größe-1
        andereNamen[0] = "Peter";
        andereNamen[0] = "Carol"; // Element wird überschrieben

        // Werte können nur an gültigen Positionen abgelegt werden
        // andereNamen[11] = "Bruce"; // Exception: ArrayIndexOutOfBoundsException
        // andereNamen[-1] = "Bruce"; // Exception: ArrayIndexOutOfBoundsException

        // Arrays = Utility-Klasse für Arrays
        System.out.println(Arrays.toString(andereNamen)); // Alle werte Lesen und anzweigen
        System.out.println(andereNamen[0]); // Lesen

        System.out.println();

        show(i);
        show(j);
        show(7, 15, 8);
        show();

        String a = new String("Hallo");
        String b = new String("Hallo");
        System.out.println(a == b); // ist es das gleiche Objekt?
        System.out.println(a.equals(b)); // hat es den gleiche Inhalt?
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    // ... VarArgs erlaubt 0-n Werte als Parameter
    private static void show(int... werte) {
        System.out.println(Arrays.toString(werte));
    }

    /*
    private static void show(int wert) {
        System.out.println(wert);
    }

    // Überladen = Gleicher Name aber eine andere Parameter-Liste
    private static void show(int[] werte) {
        System.out.println(werte);
        System.out.println(Arrays.toString(werte));
    }
    */
}
