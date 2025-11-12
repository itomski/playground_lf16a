package de.gfn.playground.collections;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListTest2 {

    public static void main(String[] args) {

        // Generische Typen MÜSSEN komplex sein
        // komplexe Datentypen basieren auf einer Klasse
        // Eigene Klassen sind neue Datentypen

        String s = "Moin"; // komplex
        byte b1 = 10; // primitiv
        Byte b2 = 20; // komplex

        // primitiven Datentypen
        // byte < short < int < long < float < double
        //         char <

        // Wrappertypen (komplex)
        // Byte, Short, Integer, Long, Float, Double
        // Character

        ArrayList<Integer> zahlen = new ArrayList<>();
        // ArrayList<Person> personen = new ArrayList<>();
        // ArrayList<Pilz> pilz = new ArrayList<>();
        ArrayList<String> namen = new ArrayList<>();
        ArrayList<LocalDate> cal = new ArrayList<>();

        namen.add("Peter");
        namen.add("Bruce");
        namen.add(0, "Carol");
        String name = namen.get(1);
        System.out.println();

        cal.add(LocalDate.of(2000, 5, 22));
        cal.add(LocalDate.now());
        cal.add(0, LocalDate.of(2022, 8, 2));
        LocalDate date = cal.get(1);
    }
}
