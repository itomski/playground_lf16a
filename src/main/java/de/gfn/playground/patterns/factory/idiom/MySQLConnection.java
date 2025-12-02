package de.gfn.playground.patterns.factory.idiom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private static final String HOST = "jdbc:mysql://localhost";
    private static final String PORT = "3306";
    private static final String DB_NAME = "factory_test";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection get() throws SQLException {
        return DriverManager.getConnection(HOST + ":" + PORT + "/" + DB_NAME, USER, PASSWORD);
    }
}
