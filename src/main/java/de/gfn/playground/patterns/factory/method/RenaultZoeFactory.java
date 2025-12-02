package de.gfn.playground.patterns.factory.method;

public class RenaultZoeFactory extends AbstractFahrzeugFactory {
    @Override
    public AbstractFahrzeug baueFahrzeug(MotorTyp motorTyp) {
        return new RenaultZoe();
    }
}
