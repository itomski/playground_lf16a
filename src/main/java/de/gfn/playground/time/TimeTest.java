package de.gfn.playground.time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

public class TimeTest {

    public static void main(String[] args) {

        // LocalTime und LocalDateTime sind immutable
        // Nur Zeit
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        lt1 = LocalTime.of(17, 22);
        System.out.println(lt1);
        System.out.println(lt1.getLong(ChronoField.MICRO_OF_DAY));

        System.out.println();

        // Datum und Zeit
        LocalDateTime ldt1 = LocalDateTime.of(2025, Month.JANUARY, 7, 18, 25);
        System.out.println(ldt1);
        System.out.println(ldt1.toLocalDate());
        System.out.println(ldt1.toLocalTime());

        final DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(ldt1.format(FMT));

    }
}
