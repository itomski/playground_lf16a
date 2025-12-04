package de.gfn.playground.lambas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        // void accept(T t)
        Consumer<String> cons1 = s -> System.out.println(s.toUpperCase());

        Consumer<String> cons2 = s -> {
            System.out.println(s.toLowerCase());
            // kein return, Rückgabetyp = void
        };

        cons1.accept("Das ist das Haus von Nikigraus");
        cons2.accept("Das ist das Haus von Nikigraus");

        System.out.println();

        List<String> namen = List.of("Peter", "Bruce", "Carol", "Natasha", "Steve");
        namen.forEach(cons2);

        System.out.println();

        List<Double> zahlen = List.of(10.5, 7.2, 18.22, -12.0, 22.786);
        zahlen.forEach(z -> System.out.println(z * z));

    }
}
