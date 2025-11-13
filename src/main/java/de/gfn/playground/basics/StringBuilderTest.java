package de.gfn.playground.basics;

public class StringBuilderTest {

    public static void main(String[] args) {

        String s = "Das ist";
        s += " das Haus";
        s += " von";
        s += " Nikigraus";
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Das ist");
        //sb.append(" das Haus").append(" von").append(" Nikigraus");
        sb.append(" das Haus"); // An das Ende der Zeichenkette dranhängen
        sb.append(" von");
        sb.append(" Nikigraus");
        sb.delete(1, 5); // Den Bereich zwischen startIndex und endIndex löschen
        sb.insert(1, "xyz"); // An gewünschte Position anhängen
        sb.replace(7, 9, "..."); // Gewüschten Bereich ersetzen
        System.out.println(sb.toString()); // Aus dem Inhalt einen String erzeugen

        sb = new StringBuilder();
        //sb = new StringBuilder(100); // Vorgabe der Startgröße
        sb = new StringBuilder("abc"); // Anzahl der Zeichen + 16
        System.out.println(sb.capacity());
        sb.append("11111111111111111");
        System.out.println(sb.capacity()); // alte größe * 2 + 2
        sb.trimToSize(); // Auf die benötigte Größe zuschneiden
        System.out.println(sb.capacity()); // alte größe * 2 + 2
        sb.setLength(10); // Ändert den Inhalt auf die passende Länge
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.ensureCapacity(50); // Stellt sicher das die Größe passt
        System.out.println(sb.capacity());


    }
}
