package de.gfn.playground.patterns.factory.sample;

public class TestMessageFactory extends AbstractMessageFactory{

    @Override
    public AbstractMessage createMessage(String msg) {
        System.out.println("DEBUG: " + msg);
        return null;
    }
}
