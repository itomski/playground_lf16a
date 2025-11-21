package de.gfn.playground.vererbung.zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooTest {

    public static void main(String[] args) {

        List<AbstractTier> auslauf = new ArrayList<>();
        auslauf.add(new Zebra());
        auslauf.add(new Loewe());
        auslauf.add(new Waschbaer());
        //auslauf.add(new Tier()); // Tier ist abstrakt

        // Fressen
        for(AbstractTier t : auslauf) {
            t.fressen();
        }

        System.out.println();

        // Schlafen
        for(AbstractTier t : auslauf) {
            t.schlafen();
        }
    }
}
