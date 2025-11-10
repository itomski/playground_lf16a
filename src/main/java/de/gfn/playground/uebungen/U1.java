package de.gfn.playground.uebungen;

import java.lang.foreign.MemorySegment;
import java.util.Scanner;

public class U1 {

    // Schreibe ein Array mit 10 zufälligen Ganzzaglen zwischen 1 und 6.
    // Laufe anschließen das Array durch und frage den Unser nach der Zahl.
    // Der User kann nun eine Zahl eingeben, die mit der gesuchten verglichen wird
    // Bei einem Treffer bekommt man einen Punkt, sonst 0
    // Am ende wird die Anzahl der Punkte angezeigt

    public static void main(String[] args) {

        // System.in = Eingabestrom z.B. die Konsole
        // System.out = Ausgabestrom
        // System.err = Ausgabestrom für Feheler

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl: ");
        String eingabe = scanner.nextLine();
        int zahl = Integer.parseInt(eingabe);
    }
}
