package de.gfn.playground.uebungen.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomLogger {

    private static final StringBuilder logRecords = new StringBuilder();

    private static final String RECORD_TPL = "%s : %s - %s/%s - %s \n";

    private static final DateTimeFormatter DATE_TIME_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy H:m:s");

    private CustomLogger() {
    }

    public static void debug(Class usedClass, String usedMethod, String msg) {
        log("DEBUG", usedClass, usedMethod, msg);
    }

    public static void error(Class usedClass, String usedMethod, String msg) {
        log("ERROR", usedClass, usedMethod, msg);
    }

    public static void log(String type, Class usedClass, String usedMethod, String msg) {
        String record = String.format(RECORD_TPL,
                LocalDateTime.now().format(DATE_TIME_FMT),
                type.toUpperCase(), // TODO: Auf Enum umstellen
                usedClass.getSimpleName(),
                usedMethod,
                msg);
        logRecords.append(record);
    }

    public static void print() {
        System.out.println(logRecords.toString());
    }
}
