package de.gfn.playground.patterns.factory.method;

import java.time.Year;

public class RenaultZoe extends AbstractFahrzeug {

    public RenaultZoe() {
        super("Renault", "Zoe", MotorTyp.ELEKTRO, Year.now().getValue());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RenaultZoe{");
        sb.append("marke='").append(marke).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append(", motor=").append(motor);
        sb.append(", baujahr=").append(baujahr);
        sb.append('}');
        return sb.toString();
    }
}
