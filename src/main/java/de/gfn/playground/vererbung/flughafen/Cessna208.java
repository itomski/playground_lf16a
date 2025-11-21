package de.gfn.playground.vererbung.flughafen;

public class Cessna208 implements FlugObjekt {

    private String besitzer;
    private String nr;
    private String zustand;
    private String msgStarter;

    public Cessna208(String besitzer, String nr, String zustand) {
        this.besitzer = besitzer;
        this.nr = nr;
        this.zustand = zustand;
        msgStarter =  "Cessna von " + this.besitzer + ", " + this.nr;
    }

    @Override
    public void towerKontaktieren() {
        System.out.println(msgStarter + ": Hallo. Darf ich landen?");
    }

    @Override
    public void fahrwerkAusfahern() {
        System.out.println(msgStarter + ": Mein Fahrwerk ist fest.");
    }

    @Override
    public void landebahnAnfliegen() {
        System.out.println(msgStarter + ": Auf geht's.");
    }

    @Override
    public void landen() {
        System.out.println(msgStarter + ": Hakuna Mataaaaaatttttttaaaaaa....");
    }

    @Override
    public void entladen() {
        System.out.println(msgStarter + ": " + besitzer + " und Gäste steigen aus.");
    }

    @Override
    public void aus() {
        System.out.println(msgStarter + ": Aus!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cessna208{");
        sb.append("besitzer='").append(besitzer).append('\'');
        sb.append(", nr='").append(nr).append('\'');
        sb.append(", zustand='").append(zustand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
