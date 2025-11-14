package de.gfn.playground.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedPropagationTest {

    public static void main(String[] args) {
        System.out.println("Start MAIN");
        try {
            methodA();
        } catch (FileNotFoundException e) {
            System.out.println("Problem");
        }
        System.out.println("Ende MAIN");
    }

    public static void methodA() throws FileNotFoundException {
        System.out.println("Start A");
        methodB();
        System.out.println("Ende A");
    }

    public static void methodB() throws FileNotFoundException {
        System.out.println("Start B");
        // handle (try-catch) or declare (throws)
        methodC();
        System.out.println("Ende B");
    }

    // handle or declare
    // throws = Aufrufer der Methode muss sich um die Exception kümmern
    public static void methodC() throws FileNotFoundException {
        System.out.println("Start C");
        // IO
        FileInputStream fis = new FileInputStream("data.txt");
        //...
        System.out.println("Ende C");
    }
}

