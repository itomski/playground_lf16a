package de.gfn.playground.collections;

import java.util.ArrayList;

public class ListTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1000); // Schreiben
        list.add(5000);
        list.add(1, 200); // Schreiben an eine gewünschte Position

        int i = list.get(2); // Lesen

        list.set(0, 1); // Wert an gewünschter Position überschreiben

        list.remove(0); // Wert an gewünschter Position löschen

        System.out.println(list);

        // Durchlaufen
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

        System.out.println("------------");

        for(int wert : list) {
            System.out.println(wert);
        }

        System.out.println("------------");

        list.forEach(e -> System.out.println(e));
    }
}
