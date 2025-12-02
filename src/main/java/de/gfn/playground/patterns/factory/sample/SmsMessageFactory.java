package de.gfn.playground.patterns.factory.sample;

public class SmsMessageFactory extends AbstractMessageFactory {
    @Override
    public AbstractMessage createMessage(String msg) {
        return new Sms(msg);
    }
}
