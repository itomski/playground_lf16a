package de.gfn.playground.vererbung;

public class PolyTest {

    public static void main(String[] args) {

        // Referenztyp: A
        // Objekttyp: A
        A a = new A();
        System.out.println(a.getZahl());
        System.out.println(a.zahl);

        System.out.println();

        // Referenztyp: B
        // Objekttyp: B
        B b = new B();
        System.out.println(b.getZahl());
        System.out.println(b.zahl);

        System.out.println();

        // Referenztyp: A
        // Objekttyp: B
        a = new B();
        System.out.println(a.getZahl());
        System.out.println(a.zahl);

        // Instanz-Methoden werden auf dem Objekttyp ausgeführt
        // Attribute werden auf dem Referenztyp ausgeführt

        // Attribute werden überlagert aber nicht überschrieben (hiding)
        // Nur Instanzmethoden werden überschrieben


    }
}

class A {

    public int zahl = 100;

    public int getZahl() {
        return zahl;
    }
}

class B extends A {

    public int zahl = 200;

    // Methoden suchen die Attribute in ihrer Nähe
    public int getZahl() {
        return zahl;
    }
}