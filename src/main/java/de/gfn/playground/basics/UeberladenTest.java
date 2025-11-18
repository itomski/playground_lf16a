package de.gfn.playground.basics;

public class UeberladenTest {

    public static void main(String[] args) {

        byte b = 10;
        // run(b); // b ist byte
        run(10); // 10 ist ein int - Ganzzahl-Literale sind per Standard int

        /*
        1. Passende Methode
        2. Primitive Widening
        3. Autoboxing (von primitiv zm Wrappertyp)
        4. Komplex Widening (zur Elternklasse)
        5. passender VarArg / ggfl. primitiv/komplex Widening für VarArg
         */

    }

    public static void run(byte v) {
        System.out.println("byte");
    }

    public static void run(short v) {
        System.out.println("short");
    }

//    public static void run(int v) {
//        System.out.println("int");
//    }

//    public static void run(long v) {
//        System.out.println("long");
//    }

//    public static void run(float v) {
//        System.out.println("float");
//    }

//    public static void run(double v) {
//        System.out.println("double");
//    }

//    public static void run(int... v) {
//        // v ist ein Array von Werten
//        System.out.println("int VarArg");
//    }

//    public static void run(long... v) {
//        System.out.println("long VarArg");
//    }

    public static void run(Byte v) {
        System.out.println("Byte");
    }

    public static void run(Short v) {
        System.out.println("Short");
    }

//    public static void run(Integer v) {
//        System.out.println("Integer");
//    }

    public static void run(Long v) {
        System.out.println("Long");
    }

    public static void run(Float v) {
        System.out.println("Float");
    }

    public static void run(Double v) {
        System.out.println("Double");
    }

//    public static void run(Number v) {
//        System.out.println("Number");
//    }

//    public static void run(Object v) {
//        System.out.println("Object");
//    }

    public static void run(Integer... v) {
        System.out.println("Integer VarArg");
    }
}
