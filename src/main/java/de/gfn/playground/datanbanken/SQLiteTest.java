package de.gfn.playground.datanbanken;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLiteTest {

    private static final String URL = "jdbc:sqlite:test.db";;

    public static void main(String[] args) {

        createTable();
        showData();
    }

    private static void showData() {
        try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {

            ResultSet result = stmt.executeQuery("SELECT * FROM verbrauch");
            while (result.next()) {
                System.out.println(result.getString("sorte"));
                System.out.println(result.getString("anzahl"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createTable() {
        try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {

            final String SQL = "CREATE TABLE IF NOT EXISTS verbrauch (sorte varchar(20) NOT NULL,  anzahl INT(11) NOT NULL)";
            stmt.execute(SQL);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
