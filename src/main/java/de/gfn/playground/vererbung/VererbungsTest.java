package de.gfn.playground.vererbung;

public class VererbungsTest {

    public static void main(String[] args) {
        //Pkw p1 = new Pkw();
        // Referenztyp: Pkw
        // Objekttyp: Pkw
        Pkw p1 = new Pkw("HH:AB123", "Ford", "Mustang", 1975);
        p1.setFahrer("Bruce Banner");
        System.out.println(p1.getFahrer()); // getFahrer = von Fahrzeug geerbt
        System.out.println();

        // Referenztyp: Kann die Klasse selst oder seine Elternklasse sein
        // Objekttyp: Kraftrad
        Fahrzeug k1 = new Kraftrad("HH:XY345", "Honda", "CB1000GT", 2025);
        k1.setFahrer("Carol Danvers"); // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt
        System.out.println(k1.getFahrer()); // getFahrer = geerbt und überschrieben

        System.out.println();
        k1 = new Pkw("XZ:AB297", "KIA", "Unbekannt", 2020);
        k1.setFahrer("Carol Danvers");
        System.out.println(k1.getFahrer());
    }
}

class Fahrzeug {

    // private Attribute und Methoden werden nicht vererbt
    // private = ist in der Kindklasse nur über Getter- und Setter verfügbar
    private String kennzeichen;
    private String marke;
    private String modell;
    private int baujahr;

    // Konstruktoren werden NICHT vererbt!
    public Fahrzeug() {
        // super();
        System.out.println("K: Fahrzeug (Parameterlos)");
    }

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        System.out.println("K: Fahrzeug (mit 4 Parametern)");
    }

    // protected = ist in der Kindklasse dirket ansprechbar
    protected String fahrer;


    // Alle public und protected Methoden werden an Kindklassen vererbt
    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getFahrer() {
        return fahrer;
    }

    public void setFahrer(String fahrer) {
        this.fahrer = fahrer;
    }
}

class Pkw extends Fahrzeug {

    private String[] insassen = new String[4];

    public Pkw() {
        // Nur der Parameterloser-Konstruktor der Elternklasse kann automatisch aufgerufen werden
        // super(); = Aufruf des Konstruktors der Elternklasse
        System.out.println("K: Pkw");
    }

    public Pkw(String kennzeichen, String marke, String modell, int baujahr) {
        // über aufruf von super kann jeder Konstruktor der sichtbare Elternklasse benutzt werden
        // Wird über sper ein Konstruktor direkt aufgerufen, wird der default Konstruktor nicht mehr
        // automatisch aufgerufen
        super(kennzeichen, marke, modell, baujahr);
//        setKennzeichen(kennzeichen);
//        setMarke(marke);
//        setModell(modell);
//        setBaujahr(baujahr);
        System.out.println("K: Pkw (mit 4 Parametern)");
    }

    public String[] getInsassen() {
        return insassen;
    }

    public void setInsassen(String[] insassen) {
        this.insassen = insassen;
    }
}

class Lkw extends Fahrzeug {

    private String beifahrer;
    private String[] ladung;

    public String getBeifahrer() {
        return beifahrer;
    }

    public void setBeifahrer(String beifahrer) {
        this.beifahrer = beifahrer;
    }

    public String[] getLadung() {
        return ladung;
    }

    public void setLadung(String[] ladung) {
        this.ladung = ladung;
    }
}

class Kraftrad extends Fahrzeug {

    private String beifahrer;

    // Ist kein eigener Konstruktor vorhanden wird ein Defaultkonstruktor bereitgestellt
//    public Kraftrad() {
//        super();
//    }

    public Kraftrad() {
        System.out.println("K: Kraftrad");
    }

    public Kraftrad(String kennzeichen, String marke, String modell, int baujahr) {
        super(kennzeichen, marke, modell, baujahr);
        System.out.println("K: Kraftrad (mit 4 Parametern)");
    }

    // In der Kindklasse können beerbt Methoden "überschrieben" werden

    @Override // Override prüft, ob in der Elternklasse eine Methode mit der gleichen Signatur enthalten ist
    public String getFahrer() {
        // gleichnamige Methoden aus der Elternklasse werden über super aufgerufen
        return super.getFahrer().toUpperCase();
    }

    public String getBeifahrer() {
        return beifahrer;
    }

    public void setBeifahrer(String beifahrer) {
        this.beifahrer = beifahrer;
    }
}