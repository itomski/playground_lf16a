package de.gfn.playground.streams;

import java.util.stream.IntStream;

public class StreamTest {

    public static void main(String[] args) {

        IntStream.iterate(0, i -> i + 1)
                .limit(5000)
                .forEach(System.out::println);
    }
}
