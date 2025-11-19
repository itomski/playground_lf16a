package de.gfn.playground.time;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateTest {

    public static void main(String[] args) {

        // Kein Konstruktoraufruf möglich
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        ld1 = LocalDate.of(2025, 11, 19);
        System.out.println(ld1);

        ld1 = LocalDate.of(2025, Month.NOVEMBER, 19);
        System.out.println(ld1);

        ld1 = LocalDate.parse("1925-02-28"); // Verwendet das ISO-Format
        System.out.println(ld1);

        // LocalDate ist immutable
        ld1 = ld1.plusYears(10);
        ld1 = ld1.plusMonths(3);
        ld1 = ld1.plusWeeks(30);
        ld1 = ld1.plusDays(7);
        ld1 = ld1.plus(1000, ChronoUnit.DAYS);

        if(ld1.isSupported(ChronoUnit.HOURS)) { // Werden Stunden von dem Objekt unterstützt?
            ld1 = ld1.plus(1000, ChronoUnit.HOURS); // Exception: LocalDate verfügt über keine Stundenangabe
        }

        ld1 = ld1.minusWeeks(20);
        //...
        System.out.println(ld1);

        LocalDate heute = LocalDate.now();
        if(ld1.isBefore(heute)) {
            System.out.println("Liegt in der Vergangenheit!");
        }
        if(ld1.isAfter(heute)) {
            System.out.println("Liegt in der Zukunft!");
        }

        System.out.println("Wochentag: " + ld1.getDayOfWeek());
        System.out.println("Era: " + ld1.getEra());
        System.out.println("Monat: " + ld1.getMonth());
        System.out.println("Monats-Zahl: " + ld1.getMonthValue());
        System.out.println("Monatstag: " + ld1.getDayOfMonth());
        System.out.println("Monatlänge: " + ld1.lengthOfMonth());
        System.out.println("Jahr: " + ld1.getYear());
        System.out.println("Jahrlänge: " + ld1.lengthOfYear());
        System.out.println("Jahrestag: " + ld1.getLong(ChronoField.DAY_OF_YEAR));

        //final DateTimeFormatter FMT = DateTimeFormatter.ISO_WEEK_DATE;
        //final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("d. MMM yyyy");

        //Locale.setDefault(Locale.CHINA); // Wenn nicht gesetzt, wird der Standard des Rechners verwendet
        final DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(ld1.format(FMT));

        ld1 = ld1.plusYears(10).plusDays(25);

        //String str = new StringBuilder("Das ist").append(" das Haus").append(" von Nikigraus").toString();
        //System.out.println(str);
    }
}
