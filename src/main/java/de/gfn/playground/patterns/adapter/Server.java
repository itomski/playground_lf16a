package de.gfn.playground.patterns.adapter;

import java.time.LocalDateTime;

public class Server {

    public Server() {
        System.out.println(LocalDateTime.now() + ": Server wurde gestartet.");
    }

    // Enge Kopplung, verwendet eine konkrete Klasse
    // public void send(Email msg)

    // Lose Kopplung, verwendet ein Interface
    public void send(Message msg) {
        System.out.println(LocalDateTime.now() + ": Nachricht wurde verschickt.");
        msg.submit();
    }
}
