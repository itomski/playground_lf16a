package de.gfn.playground.vererbung.flughafen;

public class Boeing747 implements FlugObjekt {

    private String airline;
    private String nr;

    private static final String MSG_TPL = "%s | %s | %s \n";

    public Boeing747(String airline, String nr) {
        this.airline = airline;
        this.nr = nr;
    }

    @Override
    public void towerKontaktieren() {
        System.out.printf(MSG_TPL, nr, airline, "Kontaktiert das Tower");
    }

    @Override
    public void fahrwerkAusfahern() {
        System.out.printf(MSG_TPL, nr, airline, "Fährt das Fahrwerk aus");
    }

    @Override
    public void landebahnAnfliegen() {
        System.out.printf(MSG_TPL, nr, airline, "Fliegt die Landebahn an");
    }

    @Override
    public void landen() {
        System.out.printf(MSG_TPL, nr, airline, "Landet erfolgreich");
    }

    @Override
    public void entladen() {
        System.out.printf(MSG_TPL, nr, airline, "Gäste verlassen das Flugzeug");
    }

    @Override
    public void aus() {
        System.out.printf(MSG_TPL, nr, airline, "Stopt die Maschienen");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boeing747{");
        sb.append("airline='").append(airline).append('\'');
        sb.append(", nr='").append(nr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
