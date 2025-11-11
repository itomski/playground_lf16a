package de.gfn.playground.arrays;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest3 {

    public static void main(String[] args) {

        int[] arr = new int[50];
        System.out.println(Arrays.toString(arr));
        System.out.println();

        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 10, 30, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        arr = new int[]{7,8,2,1,0};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        String[] namen = {"Peter", "Carol", "Natasha", "Bruce", "Scott"};
        Arrays.sort(namen);
        System.out.println(Arrays.toString(namen));
        System.out.println();

        Fahrzeug[] fahrzeuge = new Fahrzeug[4];
        fahrzeuge[0] = new Fahrzeug("HH:AB123", "Fiat", "500", 2015);
        fahrzeuge[1] = new Fahrzeug("B:XY337", "Renault", "Scenic", 2022);
        fahrzeuge[2] = new Fahrzeug("M:VX572", "Ford", "Mustang", 1972);
        fahrzeuge[3] = new Fahrzeug("HB:EA992", "BMW", "5er", 1995);

        System.out.println(Arrays.toString(fahrzeuge));
        Arrays.sort(fahrzeuge); // Verwendung von Comparable
        System.out.println(Arrays.toString(fahrzeuge));

        // Comparator = Vergleichsobjekt
        Arrays.sort(fahrzeuge, new FahrzeugModellComparator()); // Verwendet den Comparator
        System.out.println(Arrays.toString(fahrzeuge));

        // Wenn ich Objekter eigener Klassen sortieren möchte, muss die Klasse entweder das Interface Comparable
        // implementieren, oder ich muss einen Comparator bereitstellen

        // Als Lambda
        // int compare(T o1, T o2)
        Comparator<Fahrzeug> nachMarke = (f1, f2) -> f1.getMarke().compareTo(f2.getMarke());
        Comparator<Fahrzeug> nachBaujahr = (f1, f2) -> f1.getBaujahr() - f2.getBaujahr();
        Comparator<Fahrzeug> nachModell = (f1, f2) -> f1.getModell().compareTo(f2.getModell());
        Arrays.sort(fahrzeuge, nachMarke); // Verwendet den Comparator
        System.out.println(Arrays.toString(fahrzeuge));
        Arrays.sort(fahrzeuge, nachMarke.thenComparing(nachModell).thenComparing(nachBaujahr));
        System.out.println(Arrays.toString(fahrzeuge));
        Arrays.sort(fahrzeuge, nachBaujahr.reversed());
        System.out.println(Arrays.toString(fahrzeuge));
        System.out.println();

        // Die meisten Klassen auf der Java Standard Library sind berits sortierbar (d.h. implementieren Comparable)
        LocalDate[] meetings = new LocalDate[4];
        meetings[0] = LocalDate.of(2015, 10, 7);
        meetings[1] = LocalDate.of(2010, 1, 2);
        meetings[2] = LocalDate.now();
        meetings[3] = LocalDate.of(1962, 11, 2);
        Arrays.sort(meetings);
        System.out.println(Arrays.toString(meetings));
    }
}
