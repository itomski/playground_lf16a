package de.gfn.playground.basics;

public class StringFormatTable {

    public static void main(String[] args) {

        String[][] data = {
                {"Peter", "Parker", "Buchhaltung"},
                {"Natasha", "Romanov", "Buchhaltung"},
                {"Carol", "Danvers", "IT"},
                {"Bruce", "Banner", "Service"},
        };

        final String ROW_TEMPLATE = "| %-15s | %-15s | %-15s | \n";

        System.out.printf(ROW_TEMPLATE, "VORNAME", "NACHNAME", "ABTEILUNG");
        for(String[] row : data) {
            System.out.printf(ROW_TEMPLATE, row[0], row[1], row[2]);
        }
    }
}
