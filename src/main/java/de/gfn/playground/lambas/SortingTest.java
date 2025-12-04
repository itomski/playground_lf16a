package de.gfn.playground.lambas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingTest {

    public static void main(String[] args) {

        Random random = new Random();

        IntSupplier w100 = () -> random.nextInt(100) + 1;
        IntSupplier rand = () -> random.nextInt(6);

        Supplier<Person> personSup = () -> {
            String[] vornamen = {"Peter", "Bruce", "Natasha", "Carol", "Scott", "Toni"};
            String[] nachnamen = {"Parker", "Banner", "Romanov", "Danvers", "Lang", "Stark"};
            return new Person(vornamen[rand.getAsInt()], nachnamen[rand.getAsInt()], w100.getAsInt());
        };

        List<Person> personen = Stream.generate(personSup).limit(10).toList(); // Fixed List
        personen = new ArrayList<>(personen); // Fixed List in eine veränderbare Liste umwandeln

        personen.forEach(p -> System.out.println(p));

        System.out.println();

        // Comparator<T>
        // int compare(T o1, T o2)

        Comparator<Person> nachVorname = (p1, p2) -> p1.getVorname().compareTo(p2.getVorname());
        Comparator<Person> nachNachname = (p1, p2) -> p1.getNachname().compareTo(p2.getNachname());
        Comparator<Person> nachAlter = (p1, p2) -> p1.getAlter() - p2.getAlter();

        //personen.sort(nachVorname);
        //personen.sort(nachNachname);
        //personen.sort(nachAlter);
        // Nach Vorname, dann Nachname, dann Alter
        personen.sort(nachVorname.thenComparing(nachNachname).thenComparing(nachAlter));

        personen.forEach(p -> System.out.println(p));



    }
}
