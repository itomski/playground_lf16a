package de.gfn.playground.vererbung.zoo;

import java.io.Serializable;

public class Zebra extends AbstractTier  {

    @Override
    public void infos() {
        System.out.println("Ist ein Zebra...");
    }
}
