package de.gfn.playground.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int zahl = 0;
        while(true) {
            try {
                System.out.print("Zahl: ");
                zahl = scanner.nextInt(); // Unchecked: InputMismatchException
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine(); // fix
                System.out.println("Muss eine Zahl sein!");
            }
        }
        scanner.nextLine(); // fix
        System.out.println(zahl);

        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate datum = null;
        while(true) {
            try {
                System.out.print("Datum: ");
                datum = LocalDate.parse(scanner.nextLine(), DATE_FMT);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Muss ein gültiges Datum sein!");
            }
        }
        System.out.println(datum.format(DATE_FMT));


    }
}
