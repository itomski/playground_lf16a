package de.gfn.playground.vererbung;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {

    public static void main(String[] args) {

        // Dieses Lambda implementiert die move()-Methode
        Movement m1 = () -> System.out.println("LEFT");
        Movement m2 = () -> System.out.println("RIGHT");
        Movement m3 = () -> System.out.println("DOWN");
        Movement m4 = () -> System.out.println("UP");

        m1.move();
        m2.move();
        m3.move();
        m4.move();

        System.out.println();

        List<String> namen = new LinkedList<>();
        namen.addAll(List.of("Peter", "Bruce", "Carol", "Steve"));

        // Consumer<T>: void accept(T t);
        Consumer<String> plain = (wert) -> System.out.println(wert);
        Consumer<String> upper = (wert) -> System.out.println(wert.toUpperCase());
        Consumer<String> lower = (wert) -> System.out.println(wert.toUpperCase());
        Consumer<String> shorter = (wert) -> System.out.println(wert.substring(0, 4));

        namen.forEach(shorter);
    }
}

// Hat ein Interface unr eine einzige abstrakte Methode, dann ist es
// ein FunctionalInterface und kann für Lambdas genutzt werden
// SAM = Single Abstract Method
@FunctionalInterface // Prüft die Regeln für ein FunctionalInterface
interface Movement {
    public void move();
}
