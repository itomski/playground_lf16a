package de.gfn.playground.datanbanken;

import java.sql.SQLException;
import java.util.NoSuchElementException;

public class TodoApp {

    public static void main(String[] args) {

        Todo todo = new Todo();
        todo.setName("Festplatte formatieren"); // Eingabe von der Konsole

        try {
            // Speichern
//            if(NextTodoRepository.insert(todo)) {
//                System.out.println("Todo wurde gespeichert");
//            }

            // Alle lesen
//            for(Todo t : NextTodoRepository.findAll()) {
//                System.out.println(t.getId() + " " + t.getName());
//            }

            // Einen Lesen
//            try {
//                Todo t = NextTodoRepository.findById(23);
//                System.out.println(t.getId() + " " + t.getName());
//            }
//            catch (NoSuchElementException e) {
//                System.out.println("Kein passender Datensatz gefunden");
//            }

            // Löschen nach der ID
//            if(NextTodoRepository.deleteById(7)) {
//                System.out.println("Datensatz wurde gelöscht");
//            }

            // Löschen nach dem Objekt
//            try {
//                Todo t = NextTodoRepository.findById(2);
//                if(NextTodoRepository.delete(t)) {
//                    System.out.println("Datensatz wurde gelöscht");
//                }
//            }
//            catch (NoSuchElementException e) {
//                System.out.println("Kein passender Datensatz gefunden");
//            }

            try {
                Todo t = NextTodoRepository.findById(5);
                t.setName("Großeinkauf");
                if(NextTodoRepository.update(t)) {
                    System.out.println("Datensatz wurde geändert");
                }
            }
            catch (NoSuchElementException e) {
                System.out.println("Kein passender Datensatz gefunden");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
