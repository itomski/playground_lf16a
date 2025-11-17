package de.gfn.playground.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NioLeseTest {

    // NIO = New IO
    public static void main(String[] args) {

        Path pfad = Paths.get("daten/data.txt");

        try {
            List<String> zeilen = Files.readAllLines(pfad);
            for(String zeile : zeilen) {
                System.out.println(zeile);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Mit Lambdas
        try {
            Files.lines(pfad)
                    //.map(z -> z.toUpperCase())
                    .forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        List<String> inhalt = new ArrayList<>();
        inhalt.add("Peter Parker");
        inhalt.add("Buce Banner");
        inhalt.add("Carol Danvers");
        inhalt.add("Natasha Romanov");
        inhalt.add("Scott Lang");

        try {
            Files.write(pfad, inhalt);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
