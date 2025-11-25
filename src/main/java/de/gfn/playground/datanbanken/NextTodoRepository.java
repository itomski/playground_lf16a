package de.gfn.playground.datanbanken;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NextTodoRepository {

    // TODO: Absichern gegen SQL-Injection

    public static boolean update(Todo todo) throws SQLException {
        final String SQL = "UPDATE todos SET name = '" + todo.getName() + "' WHERE id = " + todo.getId(); // SQL-Anweisung
        return executeSql(SQL) > 0;
    }

    public static boolean delete(Todo todo) throws SQLException {
        return deleteById(todo.getId());
    }

    public static boolean deleteById(int id) throws SQLException {
        final String SQL = "DELETE FROM todos WHERE id = " + id + " LIMIT 1"; // SQL-Anweisung
        return executeSql(SQL) > 0;
    }

    public static boolean insert(Todo todo) throws SQLException {
        final String SQL = "INSERT INTO todos (name) VALUES('" + todo.getName() + "') "; // SQL-Anweisung
        return executeSql(SQL) > 0;
    }

    private static int executeSql(final String SQL) throws SQLException {

        try(Connection conn = DatabaseUtils.getConnection()) { // Verbindung aufbauen
            Statement stmt = conn.createStatement(); // Anfrage-Objekt erzeugen
            stmt.execute(SQL);
            return stmt.getUpdateCount();
        }
    }

    public static Todo findById(int id) throws SQLException {
        return get("SELECT * FROM todos WHERE id = " + id).getFirst();
    }

    public static List<Todo> findAll() throws SQLException {
        return get("SELECT * FROM todos");
    }

    private static List<Todo> get(final String SQL) throws SQLException {

        try(Connection conn = DatabaseUtils.getConnection()) { // Verbindung aufbauen
            Statement stmt = conn.createStatement(); // Anfrage-Objekt erzeugen
            stmt.execute(SQL);
            ResultSet result = stmt.getResultSet();

            List<Todo> todos = new ArrayList<>();
            while(result.next()) {
                todos.add(populate(result));
            }
            return todos;
        }
    }

    private static Todo populate(ResultSet row) throws SQLException {
        Todo todo = new Todo();
        todo.setId(row.getInt("id"));
        todo.setName(row.getString("name"));
        return todo;
    }

    public static void createTable() throws SQLException {
        final String SQL = "CREATE TABLE IF NOT EXISTS todos " +
                " (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL)"; // SQL-Anweisung

        executeSql(SQL);
    }
}
