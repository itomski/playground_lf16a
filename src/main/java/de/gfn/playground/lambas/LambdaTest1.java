package de.gfn.playground.lambas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaTest1 {

    public static void main(String[] args) {

        String str1 = "Moin Moin!";

        var str2 = "Hallo!"; // Der Kompiler ermittelt selbst den passenden Datentyp
        // str2 = 123;

        //List<String> list = new ArrayList<>();

        // Jedes Lambda braucht ein FunctionalInterface (SAM - Single Abstract Method)
        MathOperation op1 = (p1, p2) -> {
            double zahl = p1 + p2;
            return zahl;
        };

        final int i = 10;

        // add = Referenz auf ein Opbjekt welches die überschriebene run-Methode enthält
        MathOperation add = (a, b) -> a + b;
        MathOperation multi = (a, b) -> a * b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation div = (a, b) -> a / b;

        // double run(double p1);
        Operation xyz = (a) -> a * a;

        System.out.println(add.run(10, 15));
        System.out.println(multi.run(10, 15));
        System.out.println(sub.run(10, 15));
        System.out.println(div.run(10, 15));

        // MathOperation op3 = (p1) -> p1 * p1; // Error: Entspricht NICHT dem Functional Interface
        // MathOperation op4 = p1 -> p1 * p1; // Error: Entspricht NICHT dem Functional Interface

        System.out.println();

        // T apply(T a, T b)
        BinaryOperator<Double> add2 = (a, b) -> a + b;
        System.out.println(add2.apply(10.0, 15.2));
    }
}

@FunctionalInterface
interface MathOperation {
    // Ein Functional Interface darf nur eine einzige abstrakte Methode enthalten
    double run(double p1, double p2);
}

@FunctionalInterface
interface Operation {
    double run(double p1);
}

//@FunctionalInterface // Prüft die Regeln für ein Functional Interface
interface NextMathOperation {

    double run1(double p1, double p2);

    double run2(double p1, double p2);
}
