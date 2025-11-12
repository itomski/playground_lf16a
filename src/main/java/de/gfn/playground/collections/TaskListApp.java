package de.gfn.playground.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskListApp {

    private final static Scanner scanner = new Scanner(System.in);

    private final static String KEYS = "\n\u2554--------------------------------------------\n"+
                                        "\u2551\tnew: Neuer Task \n"+
                                        "\u2551\tlist: Alle Tasks anzeigen \n"+
                                        "\u2551\tdelete: Task löschen \n"+
                                        "\u2551\texit: Programm verlassen \n"+
                                        "\u255A--------------------------------------------\n";

    // List<Task> Referenztyp
    // ArrayList<Task> Objekttyp
    // 100 = Startgröße des internen Arrays
    private static final List<Task> tasks = new ArrayList<>(100);

    public static void main(String[] args) {

        app: while(true) {

            System.out.println(KEYS);

            System.out.print("Auswahl: ");
            String auswahl = scanner.nextLine().trim().toLowerCase();

            switch (auswahl) {
                case "new" -> createTask(); // Setzt automatisch einen break
                case "list" -> printList();
                case "delete" -> deleteTask();
                case "exit" -> { break app; }
                default-> System.out.println("Falsche Auswahl");
            }
        }
        System.out.println("Programmende.");
    }

    private static void deleteTask() {
        // TODO: Löschen implementieren
    }

    private static void createTask() {
        System.out.print("Name: ");
        // String name = scanner.nextLine();
        // Task t = new Task(name);
        // tasks.add(t);
        tasks.add(new Task(scanner.nextLine()));
        System.out.println("Task wurde gespeichert.");
    }

    private static void printList() {
        if(tasks.size() == 0) {
            System.out.println("Keine Tasks vorhanden");
        }
        else {
            for (Task t : tasks) {
                System.out.println(t.toString());
            }
        }
    }
}
