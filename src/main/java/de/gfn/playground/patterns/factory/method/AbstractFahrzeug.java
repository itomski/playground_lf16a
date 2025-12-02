package de.gfn.playground.patterns.factory.method;

public abstract class AbstractFahrzeug {

    // protected = in den Kindklassen sichtbar
    protected String marke;
    protected String typ;
    protected MotorTyp motor;
    protected int baujahr;

    public AbstractFahrzeug(String marke, String typ, MotorTyp motor, int baujahr) {
        this.marke = marke;
        this.typ = typ;
        this.motor = motor;
        this.baujahr = baujahr;
    }

    @Override
    public abstract String toString(); // Kindklassen werden gezwungen die Methode einzubauen
}
