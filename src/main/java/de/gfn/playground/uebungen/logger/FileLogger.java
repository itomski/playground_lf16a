package de.gfn.playground.uebungen.logger;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {

    // System.getProperty("user.home") liefert den Benutzerordner
    private final File LOG_FILE = new File(System.getProperty("user.home") + "/logger.log");

    private static final String RECORD_TPL = "%s : %s - %s/%s - %s \n";

    private static final DateTimeFormatter DATE_TIME_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy H:m:s");

    private static final FileLogger instance = new FileLogger();

    private FileLogger() {
    }

    public static FileLogger getInstance() {
        return instance;
    }

    public void debug(Class usedClass, String usedMethod, String msg) {
        log("DEBUG", usedClass, usedMethod, msg);
    }

    public void error(Class usedClass, String usedMethod, String msg) {
        log("ERROR", usedClass, usedMethod, msg);
    }

    public void log(String type, Class usedClass, String usedMethod, String msg) {
        String record = String.format(RECORD_TPL,
                LocalDateTime.now().format(DATE_TIME_FMT),
                type.toUpperCase(), // TODO: Auf Enum umstellen
                usedClass.getSimpleName(),
                usedMethod,
                msg);

        appendToFile(record);
    }

    public void print() {
        try(BufferedReader in = new BufferedReader(new FileReader(LOG_FILE))) {
            in.lines().forEach(zeile -> System.out.println(zeile));
        }
        catch(IOException e) {
            System.out.println("Problem beim Lesen"); // TODO: an den Aufrufer weitergeben
        }
    }

    private void appendToFile(String record) {

        try(BufferedWriter out = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            out.append(record);
        }
        catch(IOException e) {
            System.out.println("Problem beim Schreiben"); // TODO: an den Aufrufer weitergeben
        }
    }
}
