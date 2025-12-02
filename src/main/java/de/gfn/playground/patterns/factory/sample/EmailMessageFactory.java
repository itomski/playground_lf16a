package de.gfn.playground.patterns.factory.sample;

public class EmailMessageFactory extends AbstractMessageFactory {

    @Override
    public AbstractMessage createMessage(String msg) {
        return new EMail(msg);
    }
}
