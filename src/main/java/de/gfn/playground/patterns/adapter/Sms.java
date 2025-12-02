package de.gfn.playground.patterns.adapter;

import java.time.LocalDateTime;

public class Sms implements Message {

    private String mobileFrom;
    private String mobileTo;
    private String msg;

    public Sms(String mobileFrom, String mobileTo, String msg) {
        this.mobileFrom = mobileFrom;
        this.mobileTo = mobileTo;
        this.msg = msg;
    }

    @Override
    public void submit() {
        StringBuilder sb = new StringBuilder("\n----- SEND SMS -----");
        sb.append("\n\tSTART: \t").append(LocalDateTime.now())
                .append("\n\tFROM: \t").append(mobileFrom)
                .append("\n\tTO: \t").append(mobileTo)
                .append("\n\tMSG: \t").append(msg)
                .append("\n----- END SMS -----");
        System.out.println(sb);
    }
}
