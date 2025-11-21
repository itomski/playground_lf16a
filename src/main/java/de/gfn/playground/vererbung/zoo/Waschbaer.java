package de.gfn.playground.vererbung.zoo;

public class Waschbaer extends AbstractTier {

    @Override
    public void schlafen() {
        System.out.println(getClass().getSimpleName() + ": Durchwühlt den Müll");
    }

    @Override
    public void infos() {
        System.out.println("Das ist der Waschbär");
    }
}
