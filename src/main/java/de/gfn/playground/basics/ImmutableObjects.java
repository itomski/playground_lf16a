package de.gfn.playground.basics;

public class ImmutableObjects {

    public static void main(String[] args) {

        String s = "Hallo";
        s = s.concat(" Welt"); // Neue Version des Strings wird wieder auf die gleiche Referenz zugewiesen
        s = s.toUpperCase();
        System.out.println(s);

        // Objekt kann nach der Erzeugung nicht mehr verändert werden
        ImmutablePerson ip = new ImmutablePerson("Peter", "Parker");
    }
}

class ImmutablePerson {

    private final String vorname;
    private final String nachname;

    // Instanzkonstanten MÜSSEN spätestens im Konstruktor belegt werden
    public ImmutablePerson(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}
