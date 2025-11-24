package de.gfn.playground.datanbanken;

import java.sql.*;
import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        // CRUD
        // Create, Read, Update, Delete

        try {
            TodoRepository.createTable();
            // TodoRepository.insert();
            // TodoRepository.delete();
            // TodoRepository.showOne();
            TodoRepository.edit();
            // showAll();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
