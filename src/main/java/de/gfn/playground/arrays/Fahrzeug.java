package de.gfn.playground.arrays;

public class Fahrzeug implements Comparable<Fahrzeug> {

    private String kennzeichen;
    private String marke;
    private String modell;
    private int baujahr;

    // Alt+Einf
    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Fahrzeug other) { // Natürliche Ordnung
        //return baujahr - other.baujahr; // Nach Baujahr
        return kennzeichen.compareTo(other.kennzeichen); // Nach Kennzeichen
    }
}
