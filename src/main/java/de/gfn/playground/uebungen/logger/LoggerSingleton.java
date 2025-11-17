package de.gfn.playground.uebungen.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerSingleton {

    private final StringBuilder logRecords = new StringBuilder();

    private static final String RECORD_TPL = "%s : %s - %s/%s - %s \n";

    private static final DateTimeFormatter DATE_TIME_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy H:m:s");

    private static final LoggerSingleton instance = new LoggerSingleton();

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
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
        logRecords.append(record);
    }

    public void print() {
        System.out.println(logRecords.toString());
    }
}

