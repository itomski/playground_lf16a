package de.gfn.playground.time;

import java.time.LocalDateTime;
import java.util.*;

public class NachDatumSortierenTest {

    public static void main(String[] args) {

        List<Termin> termine = new ArrayList<>();
        termine.add(new Termin("Essen mit Carol", "...", LocalDateTime.of(2025, 11, 19, 17, 30)));
        termine.add(new Termin("Projektmeeting", "...", LocalDateTime.of(2025, 11, 21, 10, 0)));
        termine.add(new Termin("Java Kurs", "...", LocalDateTime.of(2025, 11, 20, 8, 30)));
        termine.add(new Termin("PHP Kurs", "...", LocalDateTime.of(2025, 10, 15, 8, 30)));

        //Collections.sort(termine); // Termin muss das Comparable Interface implementieren

        Comparator<Termin> nachZeit = (t1, t2) -> t1.compareTo(t2);
        Collections.sort(termine, nachZeit); // Bei Vorgabe eines Comparaters braucht Termin das Comparable Interface NICHT!

        for(Termin t : termine) {
            System.out.println(t);
        }

        System.out.println();

        // Sortierte Menge = TreeSet ist IMMER sortiert
        Set<Termin> menge = new TreeSet<>(nachZeit); // Braucht gleich den Comparator
        menge.add(new Termin("Essen mit Carol", "...", LocalDateTime.of(2025, 11, 19, 17, 30)));
        menge.add(new Termin("Projektmeeting", "...", LocalDateTime.of(2025, 11, 21, 10, 0)));
        menge.add(new Termin("Java Kurs", "...", LocalDateTime.of(2025, 11, 20, 8, 30)));
        menge.add(new Termin("PHP Kurs", "...", LocalDateTime.of(2025, 10, 15, 8, 30)));

        for(Termin t : menge) {
            System.out.println(t);
        }

        System.out.println();

        // Sortierte Map = TreeMap ist IMMER nach Schlüssel sortiert
        Map<LocalDateTime, Termin> cal = new TreeMap<>();

        Termin termin = new Termin("Essen mit Carol", "...", LocalDateTime.of(2025, 11, 19, 17, 30));
        cal.put(termin.getZeit(), termin);

        termin = new Termin("Projektmeeting", "...", LocalDateTime.of(2025, 11, 21, 10, 0));
        cal.put(termin.getZeit(), termin);

        termin = new Termin("Java Kurs", "...", LocalDateTime.of(2025, 11, 20, 8, 30));
        cal.put(termin.getZeit(), termin);

        termin = new Termin("PHP Kurs", "...", LocalDateTime.of(2025, 10, 15, 8, 30));
        cal.put(termin.getZeit(), termin);

        for(LocalDateTime key : cal.keySet()) {
            System.out.println(cal.get(key));
        }
    }
}
