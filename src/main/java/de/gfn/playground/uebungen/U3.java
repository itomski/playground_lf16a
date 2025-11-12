package de.gfn.playground.uebungen;

import java.util.HashMap;
import java.util.Map;

public class U3 {

    public static void main(String[] args) {

        /*
        Schreibe ein Programm für eine Mitarbeiterverwaltung
        Jeder Mitasrbeiter hat einen Vor- und Nachnamen, Abteilung und eine laufende Mitarbeiternummer

        Es soll möglich sein neue Mitarbeiter hinzuzufügen (Mitarbeiternummer soll automatisch vergeben werden)
        Alle Mitarbeiter anzuzeigen
        Alle Mitarbeiter einer bestimmten Abreilung anzuzeigen
        Mitarbeiter zu löschen

        Baue die Verwaltung so auf, dass die main-Methode nur die nötigsten Funktionalitäten enthält und
        der Rest in eigene Methoden ausgelagert wird.
        */
        String[] arr = new String[4];
        arr[0] = "Peter";
        arr[1] = "Parker";
        arr[2] = "Buchhaltung";
        Mitarbeiter m = new Mitarbeiter(arr);

        Map<String, String> map = new HashMap<>();
        map.put("vorname", "Peter");
        m = new Mitarbeiter(map);

    }
}

class Mitarbeiter {

    private String vorname;
    private String nachname;
    private String abteilung;

    public Mitarbeiter(String vorname, String nachname, String abteilung) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.abteilung = abteilung;
    }

    public Mitarbeiter(String[] args) {
        this.vorname = args[0];
        this.nachname = args[1];
        this.abteilung = args[2];
    }

    public Mitarbeiter(Map<String, String> daten) {
        this.vorname = daten.getOrDefault("vorname", "Unbekannt");
        this.nachname = daten.getOrDefault("nachname", "Unbekannt");
        this.abteilung = daten.getOrDefault("abteilung", "Unbekannt");
    }
}
