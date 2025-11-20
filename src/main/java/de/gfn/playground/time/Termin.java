package de.gfn.playground.time;

import java.time.LocalDateTime;

public class Termin implements Comparable<Termin> {

    private String name;
    private String beschreibung;
    private LocalDateTime zeit;

    public Termin() {
    }

    public Termin(String name, String beschreibung, LocalDateTime zeit) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.zeit = zeit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDateTime getZeit() {
        return zeit;
    }

    public void setZeit(LocalDateTime zeit) {
        this.zeit = zeit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Termin{");
        sb.append("name='").append(name).append('\'');
        sb.append(", beschreibung='").append(beschreibung).append('\'');
        sb.append(", zeit=").append(zeit);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Termin other) {
        return zeit.compareTo(other.zeit);
    }
}
