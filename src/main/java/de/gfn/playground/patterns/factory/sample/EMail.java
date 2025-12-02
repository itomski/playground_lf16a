package de.gfn.playground.patterns.factory.sample;

public class EMail extends AbstractMessage {

    public EMail(String content) {
        super(content);
    }

    @Override
    public void send(User user) {
        // Aufbau der Verbindung zum SMTP-Server
        System.out.println("SEND MAIL TO: " + user.getFirstname() + " " + user.getLastname());
        System.out.println("EMAIL: " + user.getEmail());
        System.out.println("CONTENT: " + content);
    }
}
