package de.gfn.playground.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static void main(String[] args) {

        System.out.print("Datum (JJJJ-MM-TT): ");
        LocalDate datum = LocalDate.parse(scanner.nextLine()); // Eingabe mit ISO-Format
        System.out.println(datum); // Ausgabe per toString() mit ISO-Format
        System.out.println(datum.format(DATE_FMT)); // Ausgabe per format mit eigenem Format

        System.out.println();
        System.out.print("Datum (TT.MM.JJJJ): ");
        datum = LocalDate.parse(scanner.nextLine(), AppUtils.DATE_FMT); // Eingabe mit eigenem Format
        System.out.println(datum.format(AppUtils.DATE_FMT));

    }
}
