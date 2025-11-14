package de.gfn.playground.exceptions;

public class UncheckedPropagationTest {

    // UncheckedExceptions werden automatisch weitergegeben, wenn sie nicht behandelt wurden
    // Wird eine Exception (spätestens in main-Methode) nicht behandelt, wird das Programm abgebrochen

    public static void main(String[] args) {
        System.out.println("Start MAIN");
        try {
            methodA();
        } catch (RuntimeException e) {
            System.out.println("Problem");
        }
        System.out.println("Ende MAIN");
    }

    public static void methodA() {
        System.out.println("Start A");
        methodB();
        System.out.println("Ende A");
    }

    public static void methodB() {
        System.out.println("Start B");
//        try {
            methodC();
//        } catch (RuntimeException e) {
//            System.out.println("Problem");
//        }
        System.out.println("Ende B");
    }

    public static void methodC() {
        System.out.println("Start C");
//        try {
            String str = null;
            System.out.println(str.toUpperCase());
//        } catch (RuntimeException e) {
//            System.out.println("Problem");
//        }
        System.out.println("Ende C");
    }
}
