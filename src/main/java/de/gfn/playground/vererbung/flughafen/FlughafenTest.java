package de.gfn.playground.vererbung.flughafen;

public class FlughafenTest {

    public static void main(String[] args) {

        Flughafen hamburg = new Flughafen();

        Boeing747 lh123 = new Boeing747("Lufthansa", "lh123");
        hamburg.startLandung(lh123);

        Cessna208 smudos = new Cessna208("Smudo", "s345", "ok");
        hamburg.startLandung(smudos);

        System.out.println(hamburg.getHanger());

    }
}
