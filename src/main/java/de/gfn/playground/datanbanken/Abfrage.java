package de.gfn.playground.datanbanken;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Abfrage {

    private Map<Integer, Integer> coins = new HashMap<>();

    public static boolean buttonsDisabled = true;


    public static void main(String[] args) {

        new Abfrage().fillCoins();

        if(Abfrage.buttonsDisabled) {
            //...
        }

    }

    private void fillCoins() {
        try(Connection dbh = null; Statement stmt = dbh.createStatement()) {

            final String SQL = "SELECT * FROM Münzbestand";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                coins.put(rs.getInt("Münztyp"), rs.getInt("Anzahl"));
            }

            //... coins ist befüllt
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
