package de.gfn.playground.time;

import java.util.Random;

public class Person {

    private static final String[] VORNAMEN = {"Peter", "Bruce", "Carol", "Scott", "Natasha", "Steve", "Toni"};
    private static final String[] NACHNAMEN = {"Parker", "Banner", "Danvers", "Lang", "Romanov", "Rogers", "Stark"};
    private static final Random RAND_GEN = new Random();

    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    // Factory = Erzeugung eines vorbelegten Objekts durch einen Methodenaufruf
    public static Person rand() {
        return new Person(VORNAMEN[RAND_GEN.nextInt(7)], NACHNAMEN[RAND_GEN.nextInt(7)]);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
