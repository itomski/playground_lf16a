package de.gfn.playground.patterns.factory.sample;

public class App {

    private static AbstractMessageFactory factory = new SmsMessageFactory();

    public static void main(String[] args) {

        // Userinformationen z.B. nach dem Login aus der Datenbank
        User user = new User("Peter", "Parker", "p.parker@shield.org", "0175/2345678");
        AbstractMessage msg = factory.createMessage("Herzlich Willkommen. Das ist aber ganz toll, dass Sie da sind. Wir sind ganz begeistert.");
        if(msg != null)
            msg.send(user);

    }
}
