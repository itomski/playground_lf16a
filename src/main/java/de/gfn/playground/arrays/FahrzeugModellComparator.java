package de.gfn.playground.arrays;

import java.util.Comparator;

public class FahrzeugModellComparator implements Comparator<Fahrzeug> {
    @Override
    public int compare(Fahrzeug o1, Fahrzeug o2) {
        return o1.getModell().compareTo(o2.getModell());
    }
}
