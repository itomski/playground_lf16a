package de.gfn.playground.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class DokumentGruppe implements Dokument {

    private List<Dokument> dokumente = new ArrayList<>();

    public DokumentGruppe(Dokument... dokumente) {
        for(Dokument dok : dokumente) {
            this.dokumente.add(dok);
        }
    }

    @Override
    public void print() { // Gruppe gibt den print-Befehl an die Objekte weiter
        for(Dokument dok : dokumente) {
            dok.print();
        }
    }
}
