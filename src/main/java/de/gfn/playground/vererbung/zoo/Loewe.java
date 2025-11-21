package de.gfn.playground.vererbung.zoo;

public class Loewe extends AbstractTier {

    @Override
    public void fressen() {
        System.out.println(getClass().getSimpleName() + ": Frisst andere Tiere!");
    }

    @Override
    public void infos() {
        System.out.println("Grrrrrrr!!!!");
    }
}
