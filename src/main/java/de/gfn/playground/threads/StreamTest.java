package de.gfn.playground.threads;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class StreamTest {

    public static void main(String[] args) {

        IntConsumer cons = i -> System.out.println(Thread.currentThread().getName() + ": " + i);

        IntStream.iterate(0, i -> i + 2)
                .limit(1000)
                .parallel()
                .forEach(cons);

    }
}
