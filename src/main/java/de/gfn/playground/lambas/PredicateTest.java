package de.gfn.playground.lambas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(List.of(1,5,7,22,100,62,49,55,-17,21,14,99,1001,-18));

        // Predicate<T>
        // boolean test(T t)
        Predicate<Integer> kleinerAls50 = z -> z < 50;
        Predicate<Integer> groeßerAls75 = z -> z > 75;

        System.out.println(zahlen);
        //zahlen.removeIf(kleinerAls50.negate());
        zahlen.removeIf(kleinerAls50.or(groeßerAls75)); // Verändert die Liste
        System.out.println(zahlen);

        System.out.println();

        zahlen = new ArrayList<>(List.of(1,5,7,22,100,62,49,55,-17,21,14,99,1001,-18));

        // Verändert NICHT die Liste
        zahlen.stream()
                .filter(kleinerAls50) // alles, was kein true produziert wird ignoriert
                .forEach(z -> System.out.println(z));

        System.out.println();

        System.out.println(kleinerAls50.test(75));

    }
}
