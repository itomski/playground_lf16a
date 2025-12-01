package de.gfn.playground.locale;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ResourceBundelTest {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        //System.out.println(Locale.getDefault());
        //Locale.setDefault(Locale.FRANCE);

        System.out.println("1 : deutsch");
        System.out.println("2 : französisch");
        System.out.println("3 : englisch");
        System.out.print("Welche Sprache? ");

        Locale lang = switch(scanner.nextLine()) {
            case "1" -> Locale.GERMANY;
            case "2" -> Locale.FRANCE;
            default -> Locale.UK;
        };

        Locale.setDefault(lang);

        System.out.println();

        ResourceBundle bundle = ResourceBundle.getBundle("de.gfn.lang.msg");

        System.out.println(bundle.getString("welcome")); // Verweis auf den Key

        System.out.print(bundle.getString("input.firstname") + ": ");
        String vorname = scanner.nextLine();

        System.out.print(bundle.getString("input.lastname") + ": ");
        String nachname = scanner.nextLine();

        System.out.print(bundle.getString("input.birthdate") + ": ");
        LocalDate geburtsDatum = LocalDate.parse(scanner.nextLine(), DATE_FMT);

        System.out.printf("%s, %s, %s \n", vorname, nachname, geburtsDatum);

        System.out.println(bundle.getString("end"));
    }
}
