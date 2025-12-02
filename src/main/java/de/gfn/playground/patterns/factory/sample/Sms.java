package de.gfn.playground.patterns.factory.sample;

public class Sms extends AbstractMessage {

    public Sms(String content) {
        super((content.length() > 60) ? content.substring(0, 60) + "..." : content);
    }

    @Override
    public void send(User user) {
        // Aufbau der Verbindung zum SMS-Gateway
        System.out.println("SEND SMS TO: " + user.getFirstname() + " " + user.getLastname());
        System.out.println("MOBIL: " + user.getPhone());
        System.out.println("CONTENT: " + content);
    }
}
