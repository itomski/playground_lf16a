package de.gfn.playground.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

//        IntBox b1 = new IntBox(100);
//        System.out.println(b1.getWert());
//
//        DoubleBox b2 = new DoubleBox(100.5);
//        System.out.println(b2.getWert());

        Box<Integer> b1 = new Box<>(100);
        System.out.println(b1.getWert());
        b1.setWert(250);

        Box<Double> b2 = new Box<>(100.5);
        System.out.println(b2.getWert());
        b2.setWert(250.678);

        Box<String> b3 = new Box<>("Hallo Box");
        System.out.println(b3.getWert());
        b3.setWert("Moin");

        MathBox<Double> mb1 = new MathBox<>();
        mb1.addWert(1.5);
        mb1.addWert(2.7);
        mb1.addWert(30.123);
        mb1.addWert(40.0);
        System.out.println(mb1.getSum());

        // TODO: NaN, Infinit erklären
    }
}

class Box<T> {

    private T wert;

    public Box(T wert) {
        this.wert = wert;
    }

    public T getWert() {
        return wert;
    }

    public void setWert(T wert) {
        this.wert = wert;
    }
}

/*
class IntBox {

    private int wert;

    public IntBox(int wert) {
        this.wert = wert;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }
}

class DoubleBox {

    private double wert;

    public DoubleBox(int wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }
}
*/

// Generischer Typ muss Number oder eine Kindklasse von Number sein
class MathBox<T extends Number> {

    private List<T> werte = new ArrayList<>();

    public double getSum() {
        double sum = 0;
        for(T wert : werte) {
            sum += wert.doubleValue(); // Jede Kindklasse von Number hat die Methode doubleValue
        }
        return sum;
    }

    public void addWert(T wert) {
        this.werte.add(wert);
    }
}


