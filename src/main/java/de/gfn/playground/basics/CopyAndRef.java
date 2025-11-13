package de.gfn.playground.basics;

public class CopyAndRef {

    public static void main(String[] args) {

        // primitive Typen werden IMMER als Kopie weitergegeben
        int i = 10;
        int j = i; // Kopie
        System.out.println(i);
        System.out.println(j);
        ++i;
        System.out.println(i);
        System.out.println(j);
        countUp(i); // Änderung in der Methode hat keine Auswirkung auf das i


        // Objekte werden IMMER per Referenz weitergegeben
        Thing t1 = new Thing();
        Thing t2 = t1; // Referenz
        System.out.println(t1.wert);
        System.out.println(t2.wert);
        t1.wert = "Voll";
        System.out.println(t1.wert);
        System.out.println(t2.wert);
        change(t1);
    }

    private static void countUp(int wert) {
        // wert ist eine lokale Kopie
        wert++;
    }

    private static void change(Thing t) {
        // t ist ein Zeiger auf das Original-Objekt auf dem Heap
        t.wert = "Irgendwas";
    }

}

class Thing {
    public String wert = "Leer";
}