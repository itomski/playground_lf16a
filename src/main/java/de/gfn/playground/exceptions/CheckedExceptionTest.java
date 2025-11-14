package de.gfn.playground.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        // NIO

        Path pfad = Paths.get("data.txt");

        try {
            List<String> zeilen = Files.readAllLines(pfad); // CheckedException = Java erzwingt die Behandlung
            zeilen.forEach(zeile -> System.out.println(zeile.toUpperCase()));
        }
        catch (NoSuchFileException e) {
            System.out.println("Keine passende Datei vorhanden.");
        }
        catch (IOException e) {
            System.out.println("Problem mit der Datei.");
        }
    }
}
