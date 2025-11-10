package de.gfn.playground.imports;

public class StackTest {

    public static void main(String[] args) { // Klassenmethode

        int i = 100;

        StackTest st = new StackTest(); // Instanz
        //st.machWas();

    }

    private void machWas() { // Instanzmethode
        System.out.println("Moin!");
        //this.machWas();
        machWas();
    }
}
