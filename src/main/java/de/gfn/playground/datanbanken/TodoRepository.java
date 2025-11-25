package de.gfn.playground.datanbanken;

import java.sql.*;
import java.util.Scanner;

public class TodoRepository {

    private static final String DSN = "jdbc:sqlite:data.db"; // DSN = Data Source Name

    private static final Scanner scanner = new Scanner(System.in);

    // TODO: Konfiguration auslagern
    // TODO: Scanner auslagern
    // TODO: Eingaben auslagern
    // TODO: Absichern gegen SQL-Injection

    public static void edit() throws SQLException {

        System.out.print("\nWas willst du bearbeiten? (ID): ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("\nNeuer Name: ");
        String name = scanner.nextLine();

        final String SQL = "UPDATE todos SET name = '" + name + "' WHERE id = " + id; // SQL-Anweisung

        if(executeSql(SQL) > 0) {
            System.out.println("Datensatz wurde geändert\n");
        }
    }

    public static void delete() throws SQLException {

        System.out.print("\nWas willst du löschen? (ID): ");
        int eingabe = Integer.parseInt(scanner.nextLine());

        final String SQL = "DELETE FROM todos WHERE id = " + eingabe + " LIMIT 1"; // SQL-Anweisung

        if(executeSql(SQL) > 0) {
            System.out.println("Datensatz wurde gelöscht\n");
        }
    }

    public static void insert() throws SQLException {
        System.out.print("\nDein Todo: ");
        String eingabe = scanner.nextLine(); //  Gefahr einer SQL-Injection

        final String SQL = "INSERT INTO todos (name) VALUES('" + eingabe + "') "; // SQL-Anweisung

        if(executeSql(SQL) > 0) {
            System.out.println("Datensatz wurde gespeichert\n");
        }
    }

    private static int executeSql(final String SQL) throws SQLException {

        try(Connection conn = DriverManager.getConnection(DSN)) { // Verbindung aufbauen
            Statement stmt = conn.createStatement(); // Anfrage-Objekt erzeugen
            stmt.execute(SQL);
            return stmt.getUpdateCount();
        }
    }

    public static void showById() throws SQLException {
        System.out.print("\nWelchen Datensatz willst due lesen? (ID): ");
        int eingabe = Integer.parseInt(scanner.nextLine());
        show("SELECT * FROM todos WHERE id = " + eingabe);
    }

    public static void showAll() throws SQLException {
        show("SELECT * FROM todos");
    }

    private static void show(final String SQL) throws SQLException {

        try(Connection conn = DriverManager.getConnection(DSN)) { // Verbindung aufbauen
            Statement stmt = conn.createStatement(); // Anfrage-Objekt erzeugen
            stmt.execute(SQL);
            ResultSet result = stmt.getResultSet();

            while(result.next()) {
                System.out.print(result.getInt("id") + " ");
                System.out.print(result.getString("name"));
                System.out.println();
            }
        }
    }

    public static void createTable() throws SQLException {
        // JDBC

        final String SQL = "CREATE TABLE IF NOT EXISTS todos " +
                " (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL)"; // SQL-Anweisung

        executeSql(SQL);
    }
}
