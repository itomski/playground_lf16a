package de.gfn.playground.lambas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest {

    public static void main(String[] args) {

        // Function<T, R>
        // R apply (T t)
        Function<String, Integer> parse = s -> Integer.parseInt(s);

        int i1 = parse.apply("123");
        System.out.println(i1);

        Function<Integer, Integer> pow = z -> z * z;
        System.out.println(pow.apply(10));

        System.out.println();

        // List.of produziert eine fixed List
        //List<String> namen = List.of("Peter", "Bruce", "Carol", "Natasha", "Steve");

        List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Natasha", "Steve", "Toni", "Markus"));
        // UnaryOperator ist eine Funktion mit dem gleichen Eingangs- und Rückgabetyp
        UnaryOperator<String> up = name -> name.toUpperCase();
        System.out.println(namen);
        namen.replaceAll(up);
        System.out.println(namen);

        System.out.println();

        namen.stream()
                .map(n -> n.length()) // Function
                .filter(z -> z > 5) // Predicate
                .map(z -> z * 5) // Function
                .forEach(z -> System.out.println(z)); // Consumer

        System.out.println();

        // BiFunction<T, U, R>
        // R apply (T t, U u)
        BiFunction<String, String, String> func = (a, b) -> String.format("Mein Name ist %s %s", a, b);
        System.out.println(func.apply("Peter", "Parker"));

        // String zu LocalDate parsen
        // Das Datum um n Tage in die Zukunft schieben
        BiFunction<String, Integer, LocalDate> func2 = (s, i) -> LocalDate.parse(s).plusDays(i);

        System.out.println(func2.apply("2005-10-22", 25));

    }
}
