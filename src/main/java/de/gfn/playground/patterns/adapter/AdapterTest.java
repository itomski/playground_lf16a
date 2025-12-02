package de.gfn.playground.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        Server server = new Server();
        EMail mail = new EMail("p.parker@shield.org", "b.banner@shield.org", "Cap. America", "Hi. Ich finde, sein Anzug sitzt zu eng.");
        server.send(mail);

        Sms sms = new Sms("0175/1234567", "0168/345234", "Hi. Ich finde, sein Anzug sitzt zu eng.");
        server.send(sms);

        Tweet tweet = new Tweet("Peter Parker", "Super Heros", "Cap. America", "Hi. Ich finde, sein Anzug sitzt zu eng.", "lustig", "cap_america", "heros");
        server.send(new TweetToMessageAdapter(tweet));

    }
}
