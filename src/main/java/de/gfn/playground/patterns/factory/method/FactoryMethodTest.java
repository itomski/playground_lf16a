package de.gfn.playground.patterns.factory.method;

public class FactoryMethodTest {

    public static void main(String[] args) {
        create(new VWGolfFactory());
    }

    public static void create(AbstractFahrzeugFactory factory) {
        AbstractFahrzeug fahrzeug = factory.bestelleFahrzeug(MotorTyp.BENZIN);
        System.out.println(fahrzeug);
    }
}
