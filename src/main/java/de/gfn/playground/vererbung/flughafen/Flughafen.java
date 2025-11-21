package de.gfn.playground.vererbung.flughafen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flughafen {

    private List<FlugObjekt> hanger = new ArrayList<>();

    public void startLandung(FlugObjekt flugObjekt) {
        flugObjekt.towerKontaktieren();
        flugObjekt.fahrwerkAusfahern();
        flugObjekt.landebahnAnfliegen();
        flugObjekt.landen();
        flugObjekt.entladen();
        hanger.add(flugObjekt);
        flugObjekt.aus();
    }

    public List<FlugObjekt> getHanger() {
        return Collections.unmodifiableList(hanger); // Nichtveränderbare Referenz wird zurückgegeben
    }
}
