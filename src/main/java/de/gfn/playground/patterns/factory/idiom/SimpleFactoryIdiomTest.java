package de.gfn.playground.patterns.factory.idiom;

import java.sql.Connection;
import java.sql.SQLException;

public class SimpleFactoryIdiomTest {

    public static void main(String[] args) {


        try {
            Connection connection = ConnectionFactory.getConnection(DbType.SQLITE);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
