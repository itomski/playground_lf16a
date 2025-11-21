package de.gfn.playground.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FormatTpl {

    public static void main(String[] args) {

        Object[][] fahrzeuge = {
                {"HH:AB123", "Ford", LocalDateTime.now()},
                {"HH:XY33", "Fiat", LocalDateTime.now().minusHours(2)},
                {"HB:AB567", "Renault", LocalDateTime.now().plusMinutes(50)}
        };

        final String TPL = "| %-10s | %-15s | %-30s | \n";

        for(Object[] fahrzeug : fahrzeuge) {
            System.out.printf(TPL, fahrzeug[0], fahrzeug[1], fahrzeug[2]);
        }
    }
}
