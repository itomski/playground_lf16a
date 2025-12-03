package de.gfn.playground.vererbung.isp;

public class IspTest {

    public static void main(String[] args) {

        Server server = new Server();
        server.send(new Sms());
        //server.receive(new Sms()); // Sms ist keine Input Message
        server.send(new EMail());
        server.receive(new EMail());

    }
}

class Server {

    // Alle Methoden in einer Klasse sind automatisch package-private
    void send(OutputMessage msg) {
        msg.submit();
    }

    void receive(InputMessage msg) {
        System.out.println(msg.parse());
    }
}

/*
interface Message {

    // Alle Methoden im Interface sind automatisch public
    void submit();

    String parse();
}
*/

interface OutputMessage {

    void submit();
}

interface InputMessage {

    String parse();
}


//class Sms implements Message {
class Sms implements OutputMessage {

    @Override
    public void submit() {
        System.out.println("SMS wir verschickt");
    }

//    @Override
//    public String parse() {
//        throw new UnsupportedOperationException("Wird nicht unterstützt");
//    }
}

class EMail implements OutputMessage, InputMessage {

    @Override
    public void submit() {
        System.out.println("Mail wir verschickt");
    }

    @Override
    public String parse() {
        return "EMail wird empfangen";
    }
}