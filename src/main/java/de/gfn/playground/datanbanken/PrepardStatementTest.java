package de.gfn.playground.datanbanken;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepardStatementTest {

    public static void main(String[] args) {

        final String DSN = "jdbc:sqlite:data.db";

        // Vorlage für die Anfrage
        final String SQL = "INSERT INTO todos (name) VALUES(?)"; // SQL-Anweisung

        try(Connection conn = DriverManager.getConnection(DSN)) {
            PreparedStatement stmt = conn.prepareStatement(SQL); // Vorlage auf der Datenbank vorbereiten
            stmt.setString(1, "INSERT INTO ..."); // Daten an Platzhalter binden
            stmt.execute(); // Ausführen
            if(stmt.getUpdateCount() > 0) {
                System.out.println("Datensatz wurde gespeichert\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
