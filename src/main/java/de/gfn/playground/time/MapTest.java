package de.gfn.playground.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("München", 1_500_000);
        einwohner.put("Kiel", 500_000);
        einwohner.put("Berlin", 2_600_000);

        System.out.println(einwohner.get("München"));
        System.out.println(einwohner.get("Münster"));
        System.out.println(einwohner.getOrDefault("Münster", 0));

        // Properties sind Maps für Konfigurationen oder Übersetzungnen
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("user.home"));

        System.out.println();
        Map<LocalDate, String> cal1 = new HashMap<>();
        cal1.put(LocalDate.now(), "Essen mit Carol");
        cal1.put(LocalDate.now().plusDays(1), "Meeting mit dem Vorstand");
        cal1.put(LocalDate.now().plusDays(3), "Wochenende");

        System.out.println(cal1);
        System.out.println(cal1.getOrDefault(LocalDate.now(), "Kein Termin"));
        System.out.println(cal1.getOrDefault(LocalDate.of(2025, 11, 7), "Kein Termin"));

        Map<LocalDate, List<String>> cal2 = new HashMap<>();
        Map<LocalDate, Map<LocalTime, String>> cal3 = new HashMap<>();

    }
}
