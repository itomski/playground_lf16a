package de.gfn.playground.patterns.factory.method;

public class VWGolfFactory extends AbstractFahrzeugFactory {

    @Override
    public AbstractFahrzeug baueFahrzeug(MotorTyp motorTyp) {
        return new VwGolf(motorTyp);
    }
}
