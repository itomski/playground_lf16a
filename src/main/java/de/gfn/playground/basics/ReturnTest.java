package de.gfn.playground.basics;

public class ReturnTest {

    public static void main(String[] args) {

        doSomething(); // Keine Rückgabe

        int i = doSomethingElse();

        String s = doSomethingElse2(10);
        if(s != null)
            System.out.println(s.toUpperCase());

    }

    private static void doSomething() {
        System.out.println("doSomething");
    }

    private static int doSomethingElse() {
        System.out.println("doSomethingElse");
        //return 0; // Wenn Rückgabetyp definiert ist MUSS es ein return geben oder eine Exception wird geworfen
        throw new RuntimeException("Aktuell noch nicht fertig!");
    }

    /**
     * Sucht in einem Array nach dem Wert an Position x
     * @return Gefundener Wert oder null
     */
    public static String doSomethingElse2(int x) throws ArrayIndexOutOfBoundsException {
        String[] namen = {"Peter", "Bruce", "Carol", null, "Scott"};
        return namen[x];
    }
}
