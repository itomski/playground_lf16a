package de.gfn.playground.patterns.factory.sample;

public class PushMessageFactory extends AbstractMessageFactory {

    @Override
    public AbstractMessage createMessage(String msg) {
        throw new UnsupportedOperationException("Ist noch nicht realisiert...");
    }
}
