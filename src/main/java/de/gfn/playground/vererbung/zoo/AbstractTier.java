package de.gfn.playground.vererbung.zoo;

public abstract class AbstractTier {

    // Abstrakte Klassen können Attribute und Methoden vererben
    // Sie können aber NICHT instanziert werden

    public void fressen() {
        System.out.println(getClass().getSimpleName() + ": Isst das Futter...");
    }

    public void schlafen() {
        System.out.println(getClass().getSimpleName() + ": Schläft...");
    }

    // Diese Methode MUSS in den Kindklassen ausprogrammiert werden!
    public abstract void infos(); // Abstrakte Klassen können auch abstrakte Methoden enthalten
}
