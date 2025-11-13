package de.gfn.playground.basics;

public class StaticAttr {

    // Klassen und Instanzvariablen werden mit Standardwerten initialisiert
    private static int count;
    private String id;
    private String vorname;
    private String nachname;


    public static void main(String[] args) {
        // Lokale Variable: wind NICHT automatisch initialisiert
        int i = 100;

        System.out.println(count);
        System.out.println(i);

        StaticAttr sa1 = new StaticAttr("Peter", "Parker");
        StaticAttr sa2 = new StaticAttr("Carol", "Danvers");
        StaticAttr sa3 = new StaticAttr("Natasha", "Romanov");
        StaticAttr sa4 = new StaticAttr("Scott", "Lang");
    }

    public StaticAttr(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.id = String.format("%s%s%08d", nachname.toUpperCase().charAt(0), vorname.toUpperCase().charAt(0), ++count);
    }
}
