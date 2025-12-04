package de.gfn.playground.lambas;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SupplierTest {

    static Random random = new Random();

    public static void main(String[] args) {

        int r1 = random.nextInt(10) + 1;
        System.out.println(r1);

        System.out.println();

        System.out.println(rollW10());

        System.out.println();

        roll10Results();

        System.out.println();

        // Supplier<R>
        // R get()

        // IntSupplier, LongSupplier, DoubleSupplier = Liefern primitive Werte

        // int getAsInt()
        IntSupplier w6 = () -> random.nextInt(6) + 1;
        IntSupplier w10 = () -> random.nextInt(10) + 1;
        IntSupplier w20 = () -> random.nextInt(20) + 1;
        IntSupplier w100 = () -> random.nextInt(100) + 1;

        System.out.println(w6.getAsInt());
        System.out.println(w100.getAsInt());

        System.out.println();

        roll10Results(w100);

        System.out.println();

        // Endlose Erzeugung von Zufallszahlen
        IntStream.generate(w100)
                .limit(100)
                .forEach(i -> System.out.println(i));


        System.out.println();

        IntSupplier rand = () -> random.nextInt(6);

        Supplier<Person> sup = () -> {
            String[] vornamen = {"Peter", "Bruce", "Natasha", "Carol", "Scott", "Toni"};
            String[] nachnamen = {"Parker", "Banner", "Romanov", "Danvers", "Lang", "Stark"};
            return new Person(vornamen[rand.getAsInt()], nachnamen[rand.getAsInt()], w100.getAsInt());
        };

        Stream<Person> personen = Stream.generate(sup);
        personen.limit(1000).forEach(p -> System.out.println(p));

    }

    static void roll10Results(IntSupplier dice) {
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.getAsInt());
        }
    }

    static void roll10Results() {
        for (int i = 0; i < 10; i++) {
            System.out.println(rollW10());
        }
    }

    static int rollW10() {
        return random.nextInt(10) + 1;
    }
}
