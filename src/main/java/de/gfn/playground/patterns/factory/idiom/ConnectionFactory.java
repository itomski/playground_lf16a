package de.gfn.playground.patterns.factory.idiom;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection(DbType type) throws SQLException {

        return switch(type) {
            case MYSQL -> new MySQLConnection().get();
            case SQLITE -> new SQLiteConnection().get();
            default -> null;
        };
    }
}
