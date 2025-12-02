package de.gfn.playground.patterns.factory.method;

public abstract class AbstractFahrzeugFactory {

    public abstract AbstractFahrzeug baueFahrzeug(MotorTyp motorTyp);

    public AbstractFahrzeug bestelleFahrzeug(MotorTyp motorTyp) {
        return baueFahrzeug(motorTyp);
    }
}
