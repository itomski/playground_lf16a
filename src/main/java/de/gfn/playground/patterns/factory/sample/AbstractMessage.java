package de.gfn.playground.patterns.factory.sample;

public abstract class AbstractMessage {

    protected String content;

    public AbstractMessage(String content) {
        this.content = content;
    }

    public abstract void send(User user);
}
