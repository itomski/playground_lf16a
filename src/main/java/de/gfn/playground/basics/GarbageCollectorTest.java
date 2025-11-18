package de.gfn.playground.basics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GarbageCollectorTest {

    public static void main(String[] args) throws InterruptedException {


        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(100); // Autoboxing von int zu Integer
        zahlen.add(200);
        zahlen.add(300);
        zahlen.add(400);

        Integer i = zahlen.get(1);
        int j = zahlen.get(1); // Autounboxing von Integer auf int

    }
}

class NextThing {

    @Override
    protected void finalize() throws Throwable {
        System.out.println(".... ich sehe das weiße Licht am Ende des Tunnels...");
    }
}
