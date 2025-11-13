package de.gfn.playground.basics;

public class StringTest2 {

    public static void main(String[] args) {

        // Instanzmethoden von String erlauben Aktionen mit dem bereits vorhandenen Inhalt
        String str = "11114222879";
        String[] parts = str.split("");
        for(String part : parts) {
            System.out.println(switch(part) {
                case "1" -> "vorwärts ";
                case "2" -> "rückwärts ";
                case "3" -> "hoch ";
                case "4" -> "unter ";
                default -> "nichts ";
            });
        }

        // Statische Methoden von String erlauben Aktionen mit den Parametern
        String name = "Peter";
        String output = String.format("Das ist das Haus von %s \n", name); // Formatieren und als String zurückgeben
        System.out.println(output);
        System.out.printf("Das ist das Haus von %s \n", name); // Formatieren und auf der Konsole ausgeben

        System.out.println();

        // String Literal Pool
        String s1 = "Moin"; // Landet im String Literal Pool
        String s2 = new String("Moin"); // Landet NICHT im String Literal Pool
        String s3 = "Moin"; // Landet im String Literal Pool
        String s4 = new String("Moin"); // Landet NICHT im String Literal Pool

        System.out.println(s1 == s2); // Ist es das gleiche Objekt auf dem Speicher?
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);

        s2 = s2.intern(); // Nachträglich mit dem Pool verbinden
        System.out.println(s1 == s2);
    }
}
