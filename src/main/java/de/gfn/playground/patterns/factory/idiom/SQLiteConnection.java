package de.gfn.playground.patterns.factory.idiom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {

    private static final String URL = "jdbc:sqlite:factory.db";

    public Connection get() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
